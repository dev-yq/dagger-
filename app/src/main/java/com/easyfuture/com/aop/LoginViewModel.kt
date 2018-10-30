package com.easyfuture.com.aop

import android.arch.lifecycle.MutableLiveData
import com.easyfuture.com.base.BaseViewModel
import com.easyfuture.com.datasource.RepositoryFactory
import com.easyfuture.com.datasource.Resonse
import com.easyfuture.com.net.ApiContant
import com.easyfuture.combean.Login.Login
import javax.inject.Inject

class   LoginViewModel
@Inject constructor(re :RepositoryFactory) :BaseViewModel<LoginNavator>(re){

     private val   mutableList:MutableLiveData<String>  by  lazy {
          MutableLiveData<String>()
     }

    fun   login(userName:String ,password:String){
        var map:Map<String ,String> = mapOf("username" to  userName ,"password" to  password)
            getRepositoryFactory()
            .excutePost(ApiContant.USER_LOGIN ,map ,object :Resonse<Login>{
                override fun sucess(t: Login) {

                }


                override fun error() {

                }


            })


    }


    fun    getMutableLiveData():MutableLiveData<String>{
       return mutableList
    }








}



