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

import com.wangdong.rxjavaretrofitdaggermvp.application.MyApplication;
import com.wangdong.rxjavaretrofitdaggermvp.mvp.IView;

import butterknife.ButterKnife;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 17:46
 */
abstract class BaseActivity extends AppCompatActivity implements IView {
private  boolean isHideAppTitle = true;
private boolean isHideSysTitle = false;
public Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.onInitVariable();
        super.onCreate(savedInstanceState);
        if(this.isHideSysTitle){
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setScreenRote(true);
        ButterKnife.bind(this);
        setContentView(getLayoutId());
        if(isHideAppTitle){
            getSupportActionBar().hide();
        }
        this.onInitView();
        this.onRequestData();
        MyApplication.getInstance().addActivity(this);
    }

protected abstract int getLayoutId();

/*
 * 初始化变量
 **/
protected abstract void onInitVariable();

/*
 * 初始化布局
 **/
protected abstract void onInitView();

/*
 * 请求数据
 **/
protected abstract void onRequestData();


/*
 * 设置横竖屏切换
 * */
@SuppressLint("SourceLockedOrientationActivity")
protected void setScreenRote(boolean screenRoate){
if(screenRoate){
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else{
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        }

        /*
         * 页面跳转
         * */
        public void startActivity(Class<?> clz){
         Intent intent = new Intent();
        intent.setClass(this,clz);
        startActivity(intent);
        }

        /*
         * 携带参数的页面跳转
         * */
        public void  startActivity(Class<?> clz,Bundle bundle){
            Intent intent = new Intent();
        intent.setClass(this,clz);
        if(bundle != null){
        intent.putExtras(bundle);
        }
        startActivity(intent);
        }

/*
 * 含有Bundle通过Class打开编辑界面
 * */
public void  startActivityForResult(Class<?> clz,Bundle bundle,int requestCode){
        Intent intent = new Intent();
        intent.setClass(this,clz);
        if(bundle != null){
        intent.putExtras(bundle);
        }
        startActivityForResult(intent,requestCode);
        }

        public void  showToast(String msg,int duration){
        Toast.makeText(this,msg,duration);
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.bind(this).unbind();
        MyApplication.getInstance().removeActivity(this);
    }

        }
