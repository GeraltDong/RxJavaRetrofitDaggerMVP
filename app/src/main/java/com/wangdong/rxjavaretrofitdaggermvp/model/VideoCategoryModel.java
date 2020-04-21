package com.wangdong.rxjavaretrofitdaggermvp.model;

import androidx.lifecycle.Lifecycle;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.wangdong.rxjavaretrofitdaggermvp.Listener.ViewCategoryListener;
import com.wangdong.rxjavaretrofitdaggermvp.Observer.DefaultObserver;
import com.wangdong.rxjavaretrofitdaggermvp.activity.MainActivity;
import com.wangdong.rxjavaretrofitdaggermvp.base.BaseModel;
import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.constant.Constant;
import com.wangdong.rxjavaretrofitdaggermvp.http.APIService;
import com.wangdong.rxjavaretrofitdaggermvp.http.APIServiceManager;
import com.wangdong.rxjavaretrofitdaggermvp.http.HttpRetrofit;
import com.wangdong.rxjavaretrofitdaggermvp.utils.RxThreadUtils;

import io.reactivex.disposables.Disposable;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 17:20
 */
public class VideoCategoryModel extends BaseModel {

    private APIService apiVideoCategory;

    public VideoCategoryModel() {
        initAPI();
    }

    @Override
    protected void initAPI() {
        apiVideoCategory = APIServiceManager.getAPIService(Constant.BASE_URL);
    }

    public void getVideoCategory(MainActivity view, ViewCategoryListener viewCategoryListener){
        apiVideoCategory.getVideoCategory()
                .compose(RxThreadUtils.observableToMain())
                .as(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(view, Lifecycle.Event.ON_DESTROY)))
                .subscribe(new DefaultObserver<VideoCategory>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        viewCategoryListener.failure(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onSuccess(VideoCategory response) {
                        viewCategoryListener.success(response);
                    }
                });


    }
}
