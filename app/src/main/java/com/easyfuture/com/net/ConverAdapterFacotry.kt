package com.easyfuture.com.datasource



/*
* 数据解析抽象
*
* */
interface   ConverAdapterFacotry{

    fun   <T>converResponseBody(string: String , t: Class<T> ,call: Call<T>)


}