package com.wangdong.rxjavaretrofitdaggermvp.application;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.util.Log;

import androidx.annotation.Nullable;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.wangdong.rxjavaretrofitdaggermvp.BuildConfig;
import com.wangdong.rxjavaretrofitdaggermvp.bean.ApplicationData;
import com.wangdong.rxjavaretrofitdaggermvp.di.component.DaggerAppComponent;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 17:59
 */
public class MyApplication extends Application implements HasAndroidInjector {
    @Inject
    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
    private ArrayList<Activity> activityList = new ArrayList();
    private static MyApplication instance;
    @Inject
    public ApplicationData applicationData;

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
        initLog();
        Logger.i(applicationData.toString());
    }

    public static MyApplication getInstance(){
        return instance;
    }

    private void initLog() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                // 每个日志的全局标记。默认PRETTY_LOGGER
                .tag(this.getPackageName())
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return BuildConfig.DEBUG;
            }
        });

    }

    public void addActivity(Activity activity){
        if(activity != null){
            activityList.add(activity);
        }
    }

    public void  removeActivity(Activity activiy){
        if(activiy != null && activityList.size()>0 && activityList.contains(activiy)){
            activityList.remove(activiy);
        }
    }

    public void exitApp(){
        try {
            for(Activity activityItem:activityList){
                activityItem.finish();
            }
            activityList.clear();
        }catch (Exception e){
            Logger.e(e.getMessage());
        }finally {
            System.exit(0);
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }
}
