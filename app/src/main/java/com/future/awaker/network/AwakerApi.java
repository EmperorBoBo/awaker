package com.future.awaker.network;

import com.future.awaker.data.New;
import com.future.awaker.data.NewDetail;
import com.future.awaker.data.Special;
import com.future.awaker.data.SpecialDetail;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Copyright ©2017 by Teambition
 */

public interface AwakerApi {

    // new

    @FormUrlEncoded
    @POST("news/getNewsAll")
    Observable<HttpResult<List<New>>> getNewList(@Field("access_token") String token,
                                                 @Field("page") int page, @Field("id") int id);

    @FormUrlEncoded
    @POST("news/getNewsDetail/id/{newId}")
    Observable<HttpResult<NewDetail>> getNewDetail(@Field("access_token") String token,
                                                   @Path("newId") String newId);

    //video

    @FormUrlEncoded
    @POST("special/getSpecialList")
    Observable<HttpResult<List<Special>>> getSpecialList(@Field("access_token") String token,
                                                         @Field("page") int page, @Field("cat") int cat);

    @FormUrlEncoded
    @POST("special/getSpecialDetail/id/{id}")
    Observable<HttpResult<SpecialDetail>> getSpecialDetail(@Field("access_token") String token,
                                                           @Path("id") String id);


}
