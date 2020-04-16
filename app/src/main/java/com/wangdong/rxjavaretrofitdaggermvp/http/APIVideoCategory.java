package com.wangdong.rxjavaretrofitdaggermvp.http;

import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 17:07
 */
public interface APIVideoCategory {
    @GET("article/list/0/json")
    Observable<VideoCategory> getVideoCategory();
}
