package com.wangdong.rxjavaretrofitdaggermvp.base;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import com.wangdong.rxjavaretrofitdaggermvp.application.MyApplication;
import com.wangdong.rxjavaretrofitdaggermvp.mvp.IView;

import java.util.Objects;

import butterknife.ButterKnife;

/**
 * @author wangdong
 * @descripiton baseActivity
 * @date 2020/4/16 17:46
 */
public abstract class BaseActivity extends AppCompatActivity implements IView, LifecycleOwner {
    private boolean isHideAppTitle = true;
    private boolean isHideSysTitle = false;
    public Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.onInitVariable();
        super.onCreate(savedInstanceState);
        if (this.isHideSysTitle) {
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setScreenRote(true);
        ButterKnife.bind(this);
        setContentView(getLayoutId());
        if (isHideAppTitle) {
            Objects.requireNonNull(getSupportActionBar()).hide();
        }
        this.onInitView();
        this.onRequestData();
        MyApplication.getInstance().addActivity(this);
    }

    /**
     * 布局id
     * @return id
     */
    protected abstract int getLayoutId();

    /**
     * 初始化变量
     */
    protected abstract void onInitVariable();

    /**
     * 初始化布局
     */
    protected abstract void onInitView();

    /**
     * 请求数据
     */
    protected abstract void onRequestData();


    /**
     * 设置横竖屏切换
     * @param screenRoate
     */
    @SuppressLint("SourceLockedOrientationActivity")
    protected void setScreenRote(boolean screenRoate) {
        if (screenRoate) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }


    /**
     * 页面跳转
     * @param clz
     */
    @Override
    public void startActivity(Class<?> clz) {
        Intent intent = new Intent();
        intent.setClass(this, clz);
        startActivity(intent);
    }


    /**
     * 携带参数的页面跳转
     * @param clz
     * @param bundle
     */
    @Override
    public void startActivity(Class<?> clz, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(this, clz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }


    /**
     * 带返回值的跳转
     * @param clz
     * @param bundle
     * @param requestCode
     */
    @Override
    public void startActivityForResult(Class<?> clz, Bundle bundle, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(this, clz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    /**
     * 显示toast
     * @param msg
     * @param duration
     */
    @Override
    public void showToast(String msg, int duration) {
        Toast.makeText(this, msg, duration).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.bind(this).unbind();
        MyApplication.getInstance().removeActivity(this);
    }

}
