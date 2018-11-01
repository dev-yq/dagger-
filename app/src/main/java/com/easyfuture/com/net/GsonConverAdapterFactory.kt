package com.easyfuture.com.datasource

import com.google.gson.Gson


/*
*
* gson数据解析器
* */

class  GsonConverAdapterFactory:ConverAdapterFacotry{
    override fun <T> converResponseBody(string: String, t: Class<T>, call: Call<T>) {
        var  gson  = Gson()



        call.respsonse( gson.fromJson<T>(string ,t))
    }



    companion object {

        fun   create():GsonConverAdapterFactory{




            return  GsonConverAdapterFactory()
        }
    }





}






