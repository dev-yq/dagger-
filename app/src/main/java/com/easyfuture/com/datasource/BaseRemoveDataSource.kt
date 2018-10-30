package com.easyfuture.com.datasource


interface   BaseRemoveDataSource{


    fun  <T>excutePost(url:String  ,map:Map<String ,String>  ,httpResonse: Resonse<T>)

    fun   <T>excuteGet(url: String , map: Map<String, String>  ,httpResonse: Resonse<T>)


}