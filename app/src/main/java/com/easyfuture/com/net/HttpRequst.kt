package com.easyfuture.com.datasource




/*
*网路请求
* */

interface  HttpRequst {

    fun  <T>excutePost(url: String, map: Map<String, String> ,call: Call<T>)
    fun  <T>excuteGet(url: String, map: Map<String, String> ,call: Call<T>)

}