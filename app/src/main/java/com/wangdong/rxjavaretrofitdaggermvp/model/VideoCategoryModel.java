package com.wangdong.rxjavaretrofitdaggermvp.model;

import com.wangdong.rxjavaretrofitdaggermvp.base.BaseModel;
import com.wangdong.rxjavaretrofitdaggermvp.http.APIVideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.http.HttpRetrofit;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 17:20
 */
public class VideoCategoryModel extends BaseModel {

    private APIVideoCategory apiVideoCategory;

    @Override
    protected void InitAPI() {
        apiVideoCategory = HttpRetrofit.getAPIVideoCategory();
    }
}
