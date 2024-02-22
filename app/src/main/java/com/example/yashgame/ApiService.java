package com.example.yashgame;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {


    @POST("auth/logIn")
    Call<LoginResponse> login(@Body LoginRequest request);
}
