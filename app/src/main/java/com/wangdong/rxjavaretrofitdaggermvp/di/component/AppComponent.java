package com.wangdong.rxjavaretrofitdaggermvp.di.component;

import android.app.Application;

import com.wangdong.rxjavaretrofitdaggermvp.application.MyApplication;
import com.wangdong.rxjavaretrofitdaggermvp.di.module.ApplicationModule;
import com.wangdong.rxjavaretrofitdaggermvp.di.module.BuildActivityModule;
import com.wangdong.rxjavaretrofitdaggermvp.di.scope.ApplicationScope;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/18 15:38
 */
@ApplicationScope
@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, BuildActivityModule.class})
public interface AppComponent extends AndroidInjector<MyApplication> {
    void inject(MyApplication application);

    @Component.Builder
    interface  Builder{
        AppComponent build();
        @BindsInstance
        Builder application(Application application);
    }
}
