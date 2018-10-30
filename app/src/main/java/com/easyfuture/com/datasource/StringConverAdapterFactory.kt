package com.easyfuture.com.datasource

import com.easyfuture.com.logger.LoggerFactory
import java.lang.reflect.ParameterizedType


//数据解析器
class  StringConverAdapterFactory:ConverAdapterFacotry{
    override fun <T> converResponseBody(string: String, resonse: Resonse<T>) {



        var  cl:Class<T> = getClass(resonse)


        if(       !cl.simpleName.equals("String")){


            throw   Exception("T  is only  to String")

            return
        }
        resonse.sucess(string as  T)
    }






    companion object {


        fun    create():StringConverAdapterFactory{


            return   StringConverAdapterFactory()
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


