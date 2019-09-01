package com.example.monpaud.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.monpaud.R;

import com.example.monpaud.model.AbsenItems;
import com.example.monpaud.model.AbsenResponse;

import java.util.List;

public class ListViewAbsenOrangtua extends RecyclerView.Adapter<ListViewAbsenOrangtua.ViewHolderAbsenOrangtua> {
    private Context mContext;
    private List<AbsenItems> mData;
//    private RequestManager requestManager;

    public ListViewAbsenOrangtua(Context mContext, List<AbsenItems> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public ViewHolderAbsenOrangtua onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.lv_absenorangtua, viewGroup, false);

        final ViewHolderAbsenOrangtua viewHolderAbsenOrangtua = new ViewHolderAbsenOrangtua(view);

        return viewHolderAbsenOrangtua;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewAbsenOrangtua.ViewHolderAbsenOrangtua viewHolderAbsenOrangtua, int i) {
        try {
            viewHolderAbsenOrangtua.Nm_Siswa.setText(mData.get(i).getNmSiswa());
            viewHolderAbsenOrangtua.Status_presensi.setText(mData.get(i).getStatusAbsen());
            viewHolderAbsenOrangtua.Tnggl_presensi.setText(mData.get(i).getTglPresensi());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        if (mData.isEmpty()) {
            return 0;
        }
        return mData.size();
    }

    public static class ViewHolderAbsenOrangtua extends RecyclerView.ViewHolder {
        TextView Nm_Siswa;
        TextView Status_presensi;
        TextView Tnggl_presensi;
        CardView cardView;

        public ViewHolderAbsenOrangtua(View itemView) {
            super(itemView);
            Nm_Siswa = (TextView) itemView.findViewById(R.id.tv_nama_siswa);
            Tnggl_presensi = (TextView) itemView.findViewById(R.id.tv_tanggal_presensi);
            Status_presensi = (TextView) itemView.findViewById(R.id.tv_status_presensi);
            cardView = itemView.findViewById(R.id.card_view_absensiorangtua);
        }
    }
}


