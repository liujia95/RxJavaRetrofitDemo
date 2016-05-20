package com.example.administrator.rxjavaretrofitdemo.http;

import com.example.administrator.rxjavaretrofitdemo.entity.MovieEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/5/20 9:35.
 */
public interface MovieService {
    @GET("top250")
    Call<MovieEntity> getTopMovie(@Query("start") int start, @Query("count")int count);
}
