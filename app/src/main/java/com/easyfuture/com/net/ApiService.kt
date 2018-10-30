package com.easyfuture.com.net

import com.easyfuture.combean.Login.Login
import io.reactivex.Observable
import retrofit2.http.*

/*
* 接口api列表
* */
interface  ApiService{

    //登录
    @POST("user/login")
    fun   login(@Query("username") userName:String ,@Query("password")password:String ):Observable<Login>

    @POST( )
    fun    httpPostByQuery(@Url  url:String, @QueryMap map: Map<String ,String>):Observable<String>

    @POST( )
    @FormUrlEncoded
    fun   httpPostByFileMap(@Url  url:String  ,@FieldMap  map: Map<String ,String>):Observable<String>

    @POST()
   fun httpNoPamas(@Url url:String  ):Observable<String>

    @GET()
    fun    httpGetNoparams(@Url url:String):Observable<String>


    @GET()
    fun    httpPamrams(@Url  url:String  ,  @QueryMap  map: Map<String ,String>):Observable<String>










}