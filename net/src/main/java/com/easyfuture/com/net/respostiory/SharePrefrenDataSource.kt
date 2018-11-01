package com.easyfuture.com.net.respostiory

import android.content.SharedPreferences
import javax.inject.Inject

/*
*
* sharepre内部存储
*
* */
class   SharePrefrenDataSource  @Inject constructor(
    private var sharePrefrene:SharedPreferences):BaseShareprefSource{

    override fun getString(key: String): String? {
        return  sharePrefrene.getString(key ,null)
    }



    override fun getBool(key: String): Boolean {
        return  sharePrefrene.getBoolean(key ,false)
    }

    override fun getInt(key: String): Int {
        return  sharePrefrene.getInt(key ,0)
    }

    override fun getFloat(key: String): Float {
        return  sharePrefrene.getFloat(key ,0.0f)
    }


    override fun addString(key: String, value: String) {
        sharePrefrene.edit().putString(key,value).commit()
    }

    override fun addBool(key: String, value: Boolean) {
        sharePrefrene.edit().putBoolean(key,value).commit()
    }

    override fun addInt(key: String, value: Int) {
        sharePrefrene.edit().putInt(key,value).commit()
    }

    override fun addFloat(key: String, value: Float) {
        sharePrefrene.edit().putFloat(key,value).commit()
    }


}