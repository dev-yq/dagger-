package com.easyfuture.com.datasource

import javax.inject.Inject


/*

从服务器获取数据
*
* */
class  HttpDataSource @Inject constructor( var  httpRequst:  HttpRequst ,var  converAdapterFacotry: ConverAdapterFacotry):BaseRemoveDataSource{


    override fun <T> excutePost(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {


       RealCall(httpRequst,httpResonse,converAdapterFacotry).excutePost(url,map)
    }


    override fun <T> excuteGet(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {
        RealCall(httpRequst,httpResonse,converAdapterFacotry).excuteGet(url,map)

    }




}