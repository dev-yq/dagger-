package com.easyfuture.com.datasource

import javax.inject.Inject


/*

从服务器获取数据
*
* */
class  HttpDataSource @Inject constructor( var  httpRequst:  HttpRequst):BaseRemoveDataSource{
    override fun <T> excutePost(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {

        httpRequst.excutePost(url, map, httpResonse)
    }




    override fun <T> excuteGet(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {


        httpRequst.excuteGet(url, map, httpResonse)
    }


}