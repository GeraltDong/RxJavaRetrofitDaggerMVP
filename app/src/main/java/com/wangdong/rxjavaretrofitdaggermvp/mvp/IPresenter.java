package com.wangdong.rxjavaretrofitdaggermvp.mvp;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 15:56
 */
public interface IPresenter<V extends IView>{
    /**
     * @param view 绑定
     */
    void attactView(V view);

    /**
     * 防止内存泄漏，清除presenter与activity之间的绑定
     */
    void detachView();

    /**
     * @return 获取view
     */
    IView getIView();
}
