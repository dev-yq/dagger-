package com.easyfuture.com.datasource

import android.annotation.SuppressLint
import android.os.Build
import android.support.annotation.RequiresApi
import com.easyfuture.com.logger.LoggerFactory
import com.easyfuture.com.net.ApiService
import com.easyfuture.com.utils.RxScduler


/*
* refrofit发送网络请求
* */
class   RetofitHttpRequst( var apiService: ApiService ):HttpRequst{
   private lateinit var   converAdapterFacotry: ConverAdapterFacotry
    override fun addConverFacoty(converAdapterFacotry: ConverAdapterFacotry): ConverAdapterFacotry {


        this.converAdapterFacotry = converAdapterFacotry;
        return  converAdapterFacotry
    }


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
                .subscribe { s->
                    LoggerFactory.e("数据返回结果${s}")

                    if (converAdapterFacotry == null){

                        throw  NullPointerException()
                        return@subscribe
                    }
                    converAdapterFacotry.converResponseBody(s,resonse)


                }
        }

        else{
            apiService.httpPostByQuery(url ,map)
                .compose(RxScduler.applySchedulers())
                .subscribe { s->
                    LoggerFactory.e("数据返回结果${s}")
                    if (converAdapterFacotry == null){

                        throw  NullPointerException()
                        return@subscribe
                    }
                    converAdapterFacotry.converResponseBody(s,resonse)

                }
        }

    }






}