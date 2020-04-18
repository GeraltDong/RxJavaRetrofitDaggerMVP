package com.wangdong.rxjavaretrofitdaggermvp.bean;

/**
 * @author wangdong
 * @descripiton
 * @date 2020/4/18 15:50
 */
public class ApplicationData {
    private String name;
    private String Result;

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApplicationData{" +
                "name='" + name + '\'' +
                ", Result='" + Result + '\'' +
                '}';
    }
}
