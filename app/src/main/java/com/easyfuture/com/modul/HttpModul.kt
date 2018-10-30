package com.easyfuture.com.modul

import com.easyfuture.com.datasource.RepositoryFactory
import com.easyfuture.com.datasource.SharePrefrenDataSource
import com.easyfuture.com.logger.LoggerFactory
import com.easyfuture.com.net.ApiService
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

@Module
class HttpModul {
    //实例化 okhttp



    @Provides
    fun     providerOkhttp( netInterrupter: ApplicationModul.NetInterrupter)= OkHttpClient
        .Builder()
        .connectTimeout(50,TimeUnit.SECONDS)
        .readTimeout(50,TimeUnit.SECONDS)
        .addInterceptor(netInterrupter)
        .build()

    //实例化Retrofit
    @Provides
   fun    providerRetofit() = Retrofit.Builder()
        .baseUrl("http://www.wanandroid.com/")

        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()


    @Provides
    fun   provideApiService(retrofit: Retrofit)= retrofit.create(ApiService::class.java)



    //拦截器


}