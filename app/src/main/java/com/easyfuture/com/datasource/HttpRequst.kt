package com.easyfuture.com.datasource




/*
*网路请求
* */

interface  HttpRequst{

    fun  <T>excutePost(url:String  ,map:Map<String ,String>  ,httpResonse: Resonse<T>)

    fun   <T>excuteGet(url: String , map: Map<String, String>  ,httpResonse: Resonse<T>)
    fun   addConverFacoty(converAdapterFacotry: ConverAdapterFacotry):ConverAdapterFacotry

}