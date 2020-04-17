package com.wangdong.rxjavaretrofitdaggermvp.presenter;

import com.wangdong.rxjavaretrofitdaggermvp.activity.MainActivity;
import com.wangdong.rxjavaretrofitdaggermvp.base.BasePresenter;
import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.contract.VideoCategoryContract;
import com.wangdong.rxjavaretrofitdaggermvp.model.VideoCategoryModel;
import com.wangdong.rxjavaretrofitdaggermvp.Listener.ViewCategoryListener;
import com.wangdong.rxjavaretrofitdaggermvp.mvp.IModel;

import java.util.HashMap;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/17 0:23
 */
public class VideoCategoryPresenter extends BasePresenter<MainActivity> implements VideoCategoryContract.VideoCategoryPresenter {
    @Override
    public HashMap<String, IModel> getIModelMap() {
        return loadModelMap(new VideoCategoryModel());
    }

    @Override
    public HashMap<String, IModel> loadModelMap(IModel... models) {
        HashMap<String, IModel> map = new HashMap<>(16);
        map.put("videoCategory", models[0]);
        return map;
    }

    @Override
    public void loadVideoCategory() {
        VideoCategoryModel videoCategoryModel = (VideoCategoryModel) getIModelMap().get("videoCategory");
        videoCategoryModel.getVideoCategory(getIView(), new ViewCategoryListener() {
            @Override
            public void success(VideoCategory videoCategory) {
                getIView().showVideoCategory(videoCategory);
            }

            @Override
            public void failure(String message) {

            }
        });
    }
}
