package com.wangdong.rxjavaretrofitdaggermvp.di.module;

import android.app.Application;
import android.content.pm.ApplicationInfo;

import com.wangdong.rxjavaretrofitdaggermvp.bean.ApplicationData;
import com.wangdong.rxjavaretrofitdaggermvp.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/18 15:42
 */
@Module
public class ApplicationModule {
    @ApplicationScope
    @Provides
    public ApplicationInfo provideApplication(Application application){
        return application.getApplicationInfo();
    }

    @ApplicationScope
    @Provides
    public ApplicationData provideAppDate(){
        return new ApplicationData();
    }
}
