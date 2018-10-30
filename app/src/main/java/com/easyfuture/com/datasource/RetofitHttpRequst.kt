package com.easyfuture.com.datasource

import android.annotation.SuppressLint
import android.os.Build
import android.support.annotation.RequiresApi
import com.easyfuture.com.logger.LoggerFactory
import com.easyfuture.com.net.ApiService
import com.easyfuture.com.utils.RxScduler
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type


/*
* refrofit发送网络请求
* */
class   RetofitHttpRequst( var apiService: ApiService):HttpRequst{

    override fun <T> excuteGet(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {
        if (map.isEmpty()){

        }

        else{


        }

    }

    @SuppressLint("CheckResult")
    @RequiresApi(Build.VERSION_CODES.P)
    override fun<T> excutePost(url: String, map: Map<String, String>, resonse: Resonse<T>) {
        if (map.isEmpty()){

            apiService.httpNoPamas(url)
                .compose(RxScduler.applySchedulers())
                .subscribe({
                        s->
                    LoggerFactory.e("数据返回结果${s}")
                    RealConverResponse<T>(resonse).conver(s ,getClass(resonse))



                })
        }


        else{
            apiService.httpPostByQuery(url ,map)
                .compose(RxScduler.applySchedulers())
                .subscribe({
                    s->
                    LoggerFactory.e("数据返回结果${s}")

                    RealConverResponse<T>(resonse).conver(s ,getClass(resonse))

                })
        }




    }


    fun          <T>getClass(resonse: Resonse<T>):Class<T>{
        lateinit   var s:Class<T>
        var  parameterizedType:ParameterizedType  =resonse.javaClass.genericInterfaces[0] as ParameterizedType
        s  =   parameterizedType.actualTypeArguments[0] as Class<T>
        LoggerFactory.e("方法返回类型=====:${s}")
        return   s
    }







}