package com.example.administrator.rxjavaretrofitdemo.subscribers;

public interface SubscriberOnNextListener<T> {
    void onNext(T t);
}