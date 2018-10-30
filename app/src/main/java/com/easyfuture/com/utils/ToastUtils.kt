package com.easyfuture.com.utils

import android.content.Context
import android.widget.Toast


/*
* 吐司
* */
class  ToastUtils{
    companion object {
        fun   Context.shortShow( msg:String){
            Toast.makeText(this ,msg ,Toast.LENGTH_SHORT).show()
        }

        fun   Context.showLong(msg: String){

            Toast.makeText(this, msg,Toast.LENGTH_LONG).show()
        }


    }




}