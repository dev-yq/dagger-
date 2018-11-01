package com.easyfuture.com.net.respostiory

import com.easyfuture.com.net.net.Resonse


/*
* 远程仓库
* */

interface   BaseRemoveDataSource{


    fun  <T>excutePost(url:String  ,map:Map<String ,String>  ,httpResonse: Resonse<T>)

    fun   <T>excuteGet(url: String , map: Map<String, String>  ,httpResonse: Resonse<T>)


}