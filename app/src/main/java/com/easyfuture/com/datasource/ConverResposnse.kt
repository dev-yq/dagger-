package com.easyfuture.com.datasource



/*
*  网络数据转换器
* */

interface ConverResposnse<T>{

 fun   conver(string: String ,clazz: Class<T>)
   fun      error()


}