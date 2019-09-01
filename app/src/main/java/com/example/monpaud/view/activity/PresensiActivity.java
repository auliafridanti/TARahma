package com.example.monpaud.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.example.monpaud.Api.Api;
import com.example.monpaud.Api.ApiService;
import com.example.monpaud.Api.helper.SharedPrefManager;
import com.example.monpaud.R;
import com.example.monpaud.adapter.ListViewAbsenOrangtua;
import com.example.monpaud.model.AbsenItems;
import com.example.monpaud.model.AbsenResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PresensiActivity extends AppCompatActivity {
    Api api = ApiService.getClient().create(Api.class);
    List<AbsenItems> absenItems = new ArrayList<>();
    SharedPrefManager sharedPrefManager;
    private View view;

    RecyclerView rv_list_daftar_presensi;
    ListViewAbsenOrangtua rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presensi);

        rv_list_daftar_presensi = findViewById(R.id.rv_list_daftar_presensi);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv_list_daftar_presensi.setHasFixedSize(true);
        rv_list_daftar_presensi.setLayoutManager(layoutManager);
        sharedPrefManager = new SharedPrefManager(this);
        loadData ();
        return ;
    }

    private  void loadData () {
//        api.getAbsen(sharedPrefManager.getSpEmailUser()).enqueue(new Callback<AbsenResponse>() {
////            @Override
////            public void onResponse(Call<AbsenResponse> call, Response<AbsenResponse> response) {
////                try {
////                    if (response.isSuccessful()) {
////                        absenItems = response.body().getResult();
////                        rvAdapter = new ListViewAbsenOrangtua(this, absenItems);
////                        rv_list_daftar_presensi.setAdapter(rvAdapter);
////
////                    } else {
////                        Toast.makeText(PresensiActivity.this, "mengambil data gagal", Toast.LENGTH_SHORT).show();
////                    }
////                } catch (Exception e) {
////                    e.printStackTrace();
////                }
////            }
////
////            @Override
////            public void onFailure(Call<AbsenResponse> call, Throwable t) {
////                t.printStackTrace();
////            }
////        });


    }
}
