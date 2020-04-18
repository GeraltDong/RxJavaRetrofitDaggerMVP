package com.wangdong.rxjavaretrofitdaggermvp.activity;


import android.os.Bundle;
import android.widget.TextView;

import com.wangdong.rxjavaretrofitdaggermvp.R;
import com.wangdong.rxjavaretrofitdaggermvp.base.BaseActivity;
import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.contract.VideoCategoryContract;
import com.wangdong.rxjavaretrofitdaggermvp.presenter.VideoCategoryPresenter;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

/**
 * @author wangdong
 */
public class MainActivity extends BaseActivity implements HasAndroidInjector,VideoCategoryContract.VideoCategoryView {
    @Inject
    DispatchingAndroidInjector<Object> androidInjector;

    @Inject
    public VideoCategoryPresenter videoCategoryPresenter;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onInitVariable() {
        //手动注入代码。
        AndroidInjection.inject(this);
    }

    @Override
    protected void onInitView() {
        textView = (TextView) findViewById(R.id.tv);
    }

    @Override
    protected void onRequestData() {
        videoCategoryPresenter.attactView(this);
        videoCategoryPresenter.loadVideoCategory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoCategoryPresenter != null){
            videoCategoryPresenter.detachView();
        }
    }

    @Override
    public void showVideoCategory(VideoCategory videoCategory) {
        if(videoCategory !=  null){
            textView.setText(videoCategory.toString());
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void closeLoading() {

    }

    @Override
    public void onSucess() {

    }

    @Override
    public void onFail() {

    }

    @Override
    public void onNetError() {

    }

    @Override
    public void onReLoad() {

    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return androidInjector;
    }
}
