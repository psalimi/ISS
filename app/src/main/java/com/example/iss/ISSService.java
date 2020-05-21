package com.example.iss;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ISSService {

    @GET("/iss-pass.json")
    Call<Response> getPassTimes(@Query("lat") Double lat, @Query("lon") Double lon);
}