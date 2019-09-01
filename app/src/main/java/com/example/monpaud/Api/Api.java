package com.example.monpaud.Api;

import com.example.monpaud.model.AbsenResponse;
import com.example.monpaud.model.Response_Nilai;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("absen")
    Call<AbsenResponse> getAbsen(@Query("Id_orangtua") String id_orangtua);
    @GET("nilai")
    Call<Response_Nilai> getNilai();

}
