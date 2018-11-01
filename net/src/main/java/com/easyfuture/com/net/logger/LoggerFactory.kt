package com.easyfuture.com.net.logger

import android.util.Log
import com.easyfuture.com.net.BuildConfig


/*
* 日志管理
* */

class  LoggerFactory{
    companion object  {
        var  boolean: Boolean = BuildConfig.DEBUG
        var  TAG = LoggerFactory::class.java.canonicalName
        fun   e(msg:String){
            if (boolean)
            Log.e(TAG,msg)
        }
        fun   d(msg: String?){
            if (boolean)
            Log.d(TAG,msg)

        }

        fun   v(msg: String){
            if (boolean)
            Log.v(TAG,msg)
        }

        fun   i(msg: String){
            if (boolean)
            Log.i(TAG , msg)

        }
    }


}