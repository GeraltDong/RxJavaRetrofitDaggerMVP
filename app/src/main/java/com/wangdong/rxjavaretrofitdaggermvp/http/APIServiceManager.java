package com.wangdong.rxjavaretrofitdaggermvp.http;

public class APIServiceManager{
    private static volatile APIService apiService;

    public static APIService getAPIService(String baseUrl){
        if(apiService == null){
            synchronized (APIServiceManager.class){
                if(apiService == null){
                    apiService = HttpRetrofit.getReRestrofit(baseUrl).create(APIService.class);
                }
            }
        }
        return apiService;
    }
}
