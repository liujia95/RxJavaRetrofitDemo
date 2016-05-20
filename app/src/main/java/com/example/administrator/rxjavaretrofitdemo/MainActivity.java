package com.example.administrator.rxjavaretrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.rxjavaretrofitdemo.entity.Subject;
import com.example.administrator.rxjavaretrofitdemo.http.HttpMethods;
import com.example.administrator.rxjavaretrofitdemo.subscribers.ProgressSubscriber;
import com.example.administrator.rxjavaretrofitdemo.subscribers.SubscriberOnNextListener;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.click_me_BN)
    Button clickMeBN;
    @Bind(R.id.result_TV)
    TextView resultTV;

    private SubscriberOnNextListener getTopMovieOnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getTopMovieOnNext = new SubscriberOnNextListener<List<Subject>>() {
            @Override
            public void onNext(List<Subject> subjects) {
                resultTV.setText(subjects.toString());
            }
        };
    }

    @OnClick(R.id.click_me_BN)
    public void onClick(){
        getMovie();
    }

    public void getMovie() {
        HttpMethods.getInstance().getTopMovie(new ProgressSubscriber(getTopMovieOnNext,MainActivity.this),0,10);
    }
}
