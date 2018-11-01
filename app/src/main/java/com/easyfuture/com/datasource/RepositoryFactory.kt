package com.easyfuture.com.datasource

import javax.inject.Inject

/*
* 数据仓库获取不同数据源的数据
* */
class  RepositoryFactory @Inject  constructor(var
        httpDataSource: BaseRemoveDataSource,
 var  shareprefSource: BaseShareprefSource)
{
     fun addString(key: String, value: String) {
        shareprefSource.addString(key, value)
    }

   fun addBool(key: String, value: Boolean) {

        shareprefSource.addBool(key, value)

    }


     fun addInt(key: String, value: Int) {
        shareprefSource.addInt(key, value)
    }

     fun addFloat(key: String, value: Float) {
        shareprefSource.addFloat(key, value)
    }

    fun getString(key: String): String? {

        return  shareprefSource.getString(key)
    }

    fun getBool(key: String): Boolean {

        return  shareprefSource.getBool(key)
    }

     fun getInt(key: String): Int {


      return  shareprefSource.getInt(key)
    }

   fun getFloat(key: String): Float {

        return  shareprefSource.getFloat(key)
    }

   fun <T> excutePost(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {

        httpDataSource.excutePost(url ,map,httpResonse)
    }

    fun <T> excuteGet(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {

        httpDataSource.excuteGet(url, map, httpResonse)
    }



}

