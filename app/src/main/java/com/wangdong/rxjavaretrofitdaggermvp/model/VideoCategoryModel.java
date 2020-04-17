package com.wangdong.rxjavaretrofitdaggermvp.model;

import androidx.lifecycle.Lifecycle;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.wangdong.rxjavaretrofitdaggermvp.Listener.ViewCategoryListener;
import com.wangdong.rxjavaretrofitdaggermvp.activity.MainActivity;
import com.wangdong.rxjavaretrofitdaggermvp.base.BaseModel;
import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.http.APIVideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.http.HttpRetrofit;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 17:20
 */
public class VideoCategoryModel extends BaseModel {

    private APIVideoCategory apiVideoCategory;

    public VideoCategoryModel() {
        initAPI();
    }

    @Override
    protected void initAPI() {
        apiVideoCategory = HttpRetrofit.getAPIVideoCategory();
    }

    public void getVideoCategory(MainActivity view, ViewCategoryListener viewCategoryListener){
        apiVideoCategory.getVideoCategory()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(view, Lifecycle.Event.ON_DESTROY)))
                .subscribe(new Observer<VideoCategory>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(VideoCategory videoCategory) {
                        viewCategoryListener.success(videoCategory);
                    }

                    @Override
                    public void onError(Throwable e) {
                        viewCategoryListener.failure(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
