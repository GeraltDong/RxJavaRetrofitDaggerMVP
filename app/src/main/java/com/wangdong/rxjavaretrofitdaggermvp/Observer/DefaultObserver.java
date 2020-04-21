package com.wangdong.rxjavaretrofitdaggermvp.Observer;

import com.google.gson.JsonParseException;
import com.orhanobut.logger.Logger;
import com.wangdong.rxjavaretrofitdaggermvp.utils.ToastUtil;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/21 16:09
 */
public abstract class DefaultObserver<T> implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T response) {
        onSuccess(response);
        onFinish();
    }

    @Override
    public void onError(Throwable e) {
        Logger.e(e.getMessage());
        //   HTTP错误
        if (e instanceof HttpException) {
            onException(ExceptionReason.BAD_NETWORK);
        } else if (
                //   连接错误
                e instanceof ConnectException
                || e instanceof UnknownHostException) {
            onException(ExceptionReason.CONNECT_ERROR);
        } else if (
                //  连接超时
                e instanceof InterruptedIOException) {
            onException(ExceptionReason.CONNECT_TIMEOUT);
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {
            //  解析错误
            onException(ExceptionReason.PARSE_ERROR);
        } else {
            onException(ExceptionReason.UNKNOWN_ERROR);
        }
        onFinish();
    }

    @Override
    public void onComplete() {
    }

    /**
     * 请求成功
     *
     * @param response 服务器返回的数据
     */
    abstract public void onSuccess(T response);

    /**
     * 服务器返回数据，但响应码不为200
     *
     */
    public void onFail(String message) {

    }

    public void onFinish(){}

    /**
     * 请求异常
     *
     * @param reason
     */
    public void onException(ExceptionReason reason) {
        switch (reason) {
            case CONNECT_ERROR:
                ToastUtil.setToast("连接错误");
                break;

            case CONNECT_TIMEOUT:
                ToastUtil.setToast("连接超时");
                break;

            case BAD_NETWORK:
                ToastUtil.setToast("网络无法使用");
                break;

            case PARSE_ERROR:
                ToastUtil.setToast("解析错误");
                break;

            case UNKNOWN_ERROR:
            default:
                ToastUtil.setToast("网络异常");
                break;
        }
    }

    /**
     * 请求网络失败原因
     */
    public enum ExceptionReason {
        /**
         * 解析数据失败
         */
        PARSE_ERROR,
        /**
         * 网络问题
         */
        BAD_NETWORK,
        /**
         * 连接错误
         */
        CONNECT_ERROR,
        /**
         * 连接超时
         */
        CONNECT_TIMEOUT,
        /**
         * 未知错误
         */
        UNKNOWN_ERROR,
    }
}