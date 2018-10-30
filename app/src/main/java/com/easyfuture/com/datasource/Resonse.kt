package com.easyfuture.com.datasource



//数据结果回调
interface   Resonse<T>{


    fun    sucess(t:T)

    fun    error();


}