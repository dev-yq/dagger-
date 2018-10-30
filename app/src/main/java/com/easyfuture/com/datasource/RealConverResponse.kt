package com.easyfuture.com.datasource

import com.google.gson.Gson


//数据解析
class   RealConverResponse<T>(var   resonse: Resonse<T>) :ConverResposnse<T>{
    override fun conver(string: String, clazz: Class<T>) {
        var   gson:Gson   = Gson();
        resonse.sucess(gson.fromJson(string,clazz))
    }

    override fun error() {
        resonse.error()
    }




}