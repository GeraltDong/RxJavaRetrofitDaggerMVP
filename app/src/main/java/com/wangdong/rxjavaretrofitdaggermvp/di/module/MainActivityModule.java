package com.wangdong.rxjavaretrofitdaggermvp.di.module;

import com.wangdong.rxjavaretrofitdaggermvp.di.scope.ActivityScope;
import com.wangdong.rxjavaretrofitdaggermvp.presenter.VideoCategoryPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/18 15:57
 */
@Module
public class MainActivityModule {
    @ActivityScope
    @Provides
    VideoCategoryPresenter provideVideoCategory(){
        return new VideoCategoryPresenter();
    }
}
