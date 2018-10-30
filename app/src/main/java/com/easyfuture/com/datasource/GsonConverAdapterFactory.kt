package com.easyfuture.com.datasource

import com.easyfuture.com.logger.LoggerFactory
import com.google.gson.Gson
import java.lang.reflect.ParameterizedType


/*
*
* gson数据解析器
* */

class  GsonConverAdapterFactory:ConverAdapterFacotry{
    override fun <T>converResponseBody(string: String, resonse: Resonse<T>) {
        var  gson  = Gson()
        var  clasS:Class<T> = getClass(resonse);



        resonse.sucess( gson.fromJson<T>(string!! ,clasS))
    }

    companion object {

        fun   create():GsonConverAdapterFactory{


            return  GsonConverAdapterFactory()
        }
    }


    fun        <T>getClass(resonse: Resonse<T>):Class<T>{

        lateinit   var s:Class<T>
        var  parameterizedType: ParameterizedType =resonse.javaClass.genericInterfaces[0] as ParameterizedType
        s  =   parameterizedType.actualTypeArguments[0] as Class<T>
        LoggerFactory.e("方法返回类型=====:${s}")
        return   s
    }


}






