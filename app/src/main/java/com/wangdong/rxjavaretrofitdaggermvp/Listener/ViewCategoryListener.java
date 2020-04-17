package com.wangdong.rxjavaretrofitdaggermvp.Listener;

import com.wangdong.rxjavaretrofitdaggermvp.bean.VideoCategory;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 23:59
 */
public interface ViewCategoryListener {
    void success(VideoCategory videoCategory);
    void failure(String message);
}
