package com.example.giniappshometest.network;

import com.example.giniappshometest.model.NumberList;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetNumberDataService {
    @GET("8wJzytQX")
    Call<NumberList> getNumberData();
}
