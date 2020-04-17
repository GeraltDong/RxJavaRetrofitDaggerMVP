package com.wangdong.rxjavaretrofitdaggermvp.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.wangdong.rxjavaretrofitdaggermvp.mvp.IView;

import butterknife.ButterKnife;

/**
 * @author wangdong
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements IView {
    private View mRootView;
    private P mPresenter;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(mRootView == null){
            mRootView = inflater.inflate(getLayoutId(),container,false);
        }
        ButterKnife.bind(this,mRootView);
        initInject();
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.attactView(this);
        initEventAndData();
    }

    /**
     * 布局id
     * @return
     */
    protected abstract int getLayoutId();


    /**
     * dagger inject
     */
    protected abstract void initInject();


    /**
     * 初始化数据
     */
    protected abstract void initEventAndData();

    /**
     * 页面跳转
     * @param clz
     */
    @Override
    public void startActivity(Class<?> clz) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), clz);
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
        intent.setClass(getActivity(), clz);
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
        intent.setClass(getActivity(), clz);
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
        Toast.makeText(getActivity(), msg, duration).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ButterKnife.bind(this,mRootView).unbind();
        mPresenter.detachView();
    }
}
