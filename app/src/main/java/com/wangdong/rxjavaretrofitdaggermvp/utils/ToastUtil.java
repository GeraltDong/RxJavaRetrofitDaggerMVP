package com.wangdong.rxjavaretrofitdaggermvp.utils;

import android.widget.Toast;

import com.wangdong.rxjavaretrofitdaggermvp.application.MyApplication;


/**
 * @author wangdong
 */
public class ToastUtil {
    public static Toast toast;

    public static void setToast(String str) {

        if (toast == null) {
            toast = Toast.makeText(MyApplication.getInstance(), str, Toast.LENGTH_SHORT);
        } else {
            toast.setText(str);
        }
        toast.show();
    }
}
