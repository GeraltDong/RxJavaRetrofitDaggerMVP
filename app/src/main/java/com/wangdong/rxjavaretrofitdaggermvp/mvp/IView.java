package com.wangdong.rxjavaretrofitdaggermvp.mvp;

import android.os.Bundle;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 15:56
 */
public interface IView {

    /**
     * 页面跳转
     * @param clz
     */
    void startActivity(Class<?> clz);

    /**
     * 携带参数的页面跳转
     * @param clz
     * @param bundle
     */
    void startActivity(Class<?> clz, Bundle bundle);

    /**
     * 带返回值的跳转
     * @param clz
     * @param bundle
     * @param requestCode
     */
    void startActivityForResult(Class<?> clz, Bundle bundle, int requestCode);

    /**
     * 显示toast
     * @param msg
     * @param duration
     */
    void showToast(String msg, int duration);

    /**
     * 显示加载框
     */
    void showLoading();


    /**
     * 关闭加载框
     */
    void closeLoading();


    /**
     * 请求成功所做处理
     */
    void onSucess();


    /**
     * 请求失败所做处理
     */
    void onFail();


    /**
     * 网络异常
     */
    void onNetError();

    /**
     * 重新加载
     */
    void onReLoad();

}
