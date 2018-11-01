package com.easyfuture.com.permission

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/*
*权限分配
* */
  class   PermissionFragment   :Fragment{



    private   var   permssionCode:Int = -1;
    constructor()

    companion object {
        lateinit var   permissionCallBacks: PermissionCallBack

        fun   getInstance(permissionCallBack: PermissionCallBack):Fragment{
            permissionCallBacks = permissionCallBack;
            return   PermissionFragment()
        }
    }


    fun   setPermissionCode(permssionCode:Int){
        this.permssionCode = permssionCode;
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    //权限结果回调
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)



        when(requestCode){
            permssionCode->{

                when(grantResults[0]){
                    0-> permissionCallBacks.permissionSucss()
                    else ->permissionCallBacks.permissionFail()
                }

            }
        }
    }





}