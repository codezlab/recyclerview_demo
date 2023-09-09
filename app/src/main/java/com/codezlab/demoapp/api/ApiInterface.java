package com.codezlab.demoapp.api;

import com.codezlab.demoapp.model.BaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    public static final String API_BASE_URL="https://reqres.in/";

    @GET("api/users")
    Call<BaseResponse> getEmployees();
}
