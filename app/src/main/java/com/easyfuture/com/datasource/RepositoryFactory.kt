package com.easyfuture.com.datasource

import javax.inject.Inject


class  RepositoryFactory @Inject constructor(var

        httpDataSource: BaseRemoveDataSource,
 var  shareprefSource: BaseShareprefSource
                                           ):BaseShareprefSource ,BaseRemoveDataSource
{
    override fun addString(key: String, value: String) {

        shareprefSource.addString(key, value)
    }

    override fun addBool(key: String, value: Boolean) {

        shareprefSource.addBool(key, value)

    }


    override fun addInt(key: String, value: Int) {
        shareprefSource.addInt(key, value)
    }

    override fun addFloat(key: String, value: Float) {
        shareprefSource.addFloat(key, value)
    }

    override fun getString(key: String): String? {

        return  shareprefSource.getString(key)
    }

    override fun getBool(key: String): Boolean {

        return  shareprefSource.getBool(key)
    }

    override fun getInt(key: String): Int {


      return  shareprefSource.getInt(key)
    }

    override fun getFloat(key: String): Float {

        return  shareprefSource.getFloat(key)
    }

    override fun <T> excutePost(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {

        httpDataSource.excutePost(url ,map,httpResonse)
    }

    override fun <T> excuteGet(url: String, map: Map<String, String>, httpResonse: Resonse<T>) {

        httpDataSource.excuteGet(url, map, httpResonse)
    }


}

