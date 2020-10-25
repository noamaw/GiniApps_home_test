package com.example.giniappshometest.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static final String BASE_URL = "https://pastebin.com/raw/";
    private static Retrofit retrofit = new retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
