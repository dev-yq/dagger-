package com.easyfuture.com.datasource


interface  BaseShareprefSource{

    fun addString(key:String ,value:String)

    fun  addBool(key: String ,value: Boolean)

    fun   addInt(key: String ,value:Int)

    fun   addFloat(key: String ,value:Float)
    fun   getString(key: String):String?

    fun  getBool(key: String):Boolean

    fun   getInt(key: String):Int

    fun    getFloat(key: String):Float
}