package com.example.monpaud.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.monpaud.BuildConfig.BASE_URL;


public class ApiService {
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL+"monpaud/Api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}