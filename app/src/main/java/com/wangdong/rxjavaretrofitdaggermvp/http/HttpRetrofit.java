package com.wangdong.rxjavaretrofitdaggermvp.http;

import com.wangdong.rxjavaretrofitdaggermvp.constant.Constant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 16:52
 */
public class HttpRetrofit {
    private static volatile Retrofit sRetrofit;

    /**
     * @return okhttpClient.Builder
     */
    public static OkHttpClient.Builder getOkHttpClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor());
        return builder;
    }


    public static Retrofit getReRestrofit(String baseUrl){
        if(sRetrofit == null){
            synchronized (HttpRetrofit.class){
                if(sRetrofit == null){
                    OkHttpClient okhttpClient = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
                            .addInterceptor(new HttpLoggingInterceptor())
                            .build();
                    sRetrofit = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(okhttpClient)
                            .build();

                }
            }
        }
        return sRetrofit;
    }
}
