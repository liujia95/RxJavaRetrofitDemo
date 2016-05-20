package com.example.administrator.rxjavaretrofitdemo.http;

import com.example.administrator.rxjavaretrofitdemo.entity.HttpResult;
import com.example.administrator.rxjavaretrofitdemo.entity.Subject;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/5/20 9:35.
 */
public interface MovieService {
    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count")int count);
}
