package com.wangdong.rxjavaretrofitdaggermvp.di.module;

import com.wangdong.rxjavaretrofitdaggermvp.activity.MainActivity;
import com.wangdong.rxjavaretrofitdaggermvp.di.scope.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/18 15:54
 */
@Module
public abstract class BuildActivityModule {
    /**
     * TODO 知识点：添加了 @ContributesAndroidInjector 后，就不需要 @IntoMap 和 @ClassKey 了。因为会自动添加。
     * 如下接口，会自动生成 BuildsActivityModule_ContributeLoginActivity 类
     * 该类中会自动使用 @IntoMap 和 @ClassKey。
     *
     * @return
     */
    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributesMainActivity();
}
