package com.easyfuture.com.datasource

import com.easyfuture.com.logger.LoggerFactory
import com.easyfuture.com.net.ApiService
import com.easyfuture.com.utils.RxScduler


/*
* refrofit发送网络请求
* */
class   RetofitHttpRequst( var apiService: ApiService ):HttpRequst{
    override fun <T> excutePost(url: String, map: Map<String, String>, call: Call<T>) {
        if (map.isEmpty()){
            apiService.httpNoPamas(url)
                .compose(RxScduler.applySchedulers())
                .subscribe { s->
                    LoggerFactory.e("数据返回结果${s}")
                    call.conver(s)


                }
        }

        else{
            apiService.httpPostByQuery(url ,map)
                .compose(RxScduler.applySchedulers())
                .subscribe { s->
                    LoggerFactory.e("数据返回结果${s}")

                    call.conver(s)
                }
        }
    }

    override fun <T>excuteGet(url: String, map: Map<String, String>, call: Call<T>) {

    }


}