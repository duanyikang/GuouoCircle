package com.guoguoquan.guoguonews.Model.http;

import com.guoguoquan.guoguonews.Bean.JokeBean;
import com.guoguoquan.guoguonews.Bean.JokeServiceBean;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者：duanyikang on 2016/9/13 0013 17:02
 * 邮箱：duanyikang@yixia.com
 */
public interface JokeApi {

    @GET("xiaohua/list.do")
    Observable<JokeServiceBean> getJokeList(@Query("size") String size, @Query("page") String page);

}

