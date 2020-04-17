package com.wangdong.rxjavaretrofitdaggermvp.mvp;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 15:56
 */
public interface IView {
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
