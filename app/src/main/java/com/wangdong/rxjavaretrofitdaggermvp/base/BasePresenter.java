package com.wangdong.rxjavaretrofitdaggermvp.base;

import com.wangdong.rxjavaretrofitdaggermvp.mvp.IModel;
import com.wangdong.rxjavaretrofitdaggermvp.mvp.IPresenter;
import com.wangdong.rxjavaretrofitdaggermvp.mvp.IView;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 16:33
 */
public abstract class BasePresenter<V extends IView> implements IPresenter {

    private WeakReference viewWeakReference;

    @Override
    public void attactView(IView view) {
        viewWeakReference = new WeakReference(view);
    }

    @Override
    public void detachView() {
        if(viewWeakReference != null){
            viewWeakReference.clear();
            viewWeakReference = null;
        }
    }

    @Override
    public V getIView() {
        return (V) viewWeakReference.get();
    }

    public abstract HashMap<String, IModel> getIModelMap();

    /**
     * @param models
     * @return
     * 添加多个model,如有需要
     */
    public abstract HashMap<String, IModel> loadModelMap(IModel... models);
}
