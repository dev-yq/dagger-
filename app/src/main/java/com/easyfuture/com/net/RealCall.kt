package com.easyfuture.com.datasource

import java.lang.reflect.ParameterizedType


class  RealCall<T>( var httpRequst: HttpRequst   ,
                    var resonse: Resonse<T> ,
                    var converAdapterFacotry: ConverAdapterFacotry):Call<T> {
    override fun  respsonse(t: T) {
        resonse.sucess(t)
    }


    override fun  excutePost(url: String, map: Map<String, String>) {

        httpRequst.excutePost(url,map,this)

    }

    override fun excuteGet(url: String, map: Map<String, String>) {
        httpRequst.excuteGet(url,map,this)
    }




    override fun conver(string: String) {
        converAdapterFacotry.converResponseBody(string ,getClass(resonse) ,this)

    }




    fun        <T>getClass(resonse: Resonse<T>):Class<T>{

        lateinit   var s:Class<T>
        var  parameterizedType: ParameterizedType =resonse.javaClass.genericInterfaces[0] as ParameterizedType
        s  =   parameterizedType.actualTypeArguments[0] as Class<T>

        return   s
    }
}

