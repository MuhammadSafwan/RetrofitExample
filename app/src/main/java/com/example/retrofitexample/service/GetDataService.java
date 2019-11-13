package com.example.retrofitexample.service;

import java.util.List;

import com.example.retrofitexample.model.RetroPhoto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
