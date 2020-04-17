package com.wangdong.rxjavaretrofitdaggermvp.contract;

import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;
import com.wangdong.rxjavaretrofitdaggermvp.mvp.IView;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/17 0:34
 */
public class VideoCategoryContract {
    public interface VideoCategoryView{
        void showVideoCategory(VideoCategory videoCategory);
    }

    public interface VideoCategoryPresenter{
        void loadVideoCategory();
    }
}
