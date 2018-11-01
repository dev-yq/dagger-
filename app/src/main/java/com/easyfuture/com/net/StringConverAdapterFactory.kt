package com.easyfuture.com.net

import com.easyfuture.com.datasource.Call
import com.easyfuture.com.datasource.ConverAdapterFacotry


//数据解析器
class  StringConverAdapterFactory: ConverAdapterFacotry {
    override fun <T> converResponseBody(string: String, t: Class<T>, call: Call<T>) {

        call.respsonse(    string as  T)
    }

    companion object {


        fun    create():StringConverAdapterFactory{


            return   StringConverAdapterFactory()
        }
    }



}


