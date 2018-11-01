package com.easyfuture.com.net.respostiory

import com.easyfuture.com.net.net.HttpRequst
import com.easyfuture.com.net.net.Resonse
import javax.inject.Inject


/*

网络请求
*
* */
class  HttpDataSource @Inject constructor( var  httpRequst: HttpRequst): BaseRemoveDataSource {
    override fun <T> excutePost(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {

        httpRequst.excutePost(url, map, httpResonse)
    }




    override fun <T> excuteGet(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {


        httpRequst.excuteGet(url, map, httpResonse)
    }


}