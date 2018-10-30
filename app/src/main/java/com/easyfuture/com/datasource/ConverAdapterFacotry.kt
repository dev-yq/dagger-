package com.easyfuture.com.datasource



/*
* 数据解析抽象
*
* */
interface   ConverAdapterFacotry{

    fun   <T>converResponseBody(string: String ,resonse: Resonse<T>)



}