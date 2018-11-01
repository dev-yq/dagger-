package com.easyfuture.com.datasource





  interface  Call<T>{

      fun  excutePost(url: String, map: Map<String, String>)
      fun  excuteGet(url: String, map: Map<String, String>)


      fun  conver(string: String)


      fun   respsonse(t:T)

  }