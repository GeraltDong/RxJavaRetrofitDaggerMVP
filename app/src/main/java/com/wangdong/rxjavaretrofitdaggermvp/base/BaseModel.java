package com.wangdong.rxjavaretrofitdaggermvp.base;

import com.wangdong.rxjavaretrofitdaggermvp.mvp.IModel;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/16 16:32
 */
public abstract class BaseModel implements IModel {
    protected abstract void InitAPI();
}
