package com.wyx.warframe;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by wyx on 2018/3/20.
 */

public interface HttpService {
    @POST("/api/homepage/init")
    Observable<BaseResBean> getHomepageInit(@Body String string);
}
