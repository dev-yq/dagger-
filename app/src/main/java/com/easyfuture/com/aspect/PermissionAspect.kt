package com.easyfuture.com.aspect

import android.content.Context
import android.util.Log
import android.widget.Toast

/*
* 设置埋点
* */
@Aspect
class  PermissionAspect{

    companion object {


        var  TAG:String = "PermissionCheck"
    }


    /*
    * 切点
 * */
    @Pointcut("execution(@com.easyfuture.com.animation.PermissionCheck  * *(..)) && @annotation(ann)")
    fun   checkPermission(ann: PermissionCheck){






    }




    /*
    * 做相关逻辑操作
    *
    * */

    @Around("checkPermission(permissionCheck)")
    fun   check(proceedingJoinPoint: ProceedingJoinPoint  ,permissionCheck: PermissionCheck): Any{
        Log.e(TAG ,"---------------------------")
        var  values = permissionCheck.value

        var  context = proceedingJoinPoint.`this` as Context;
        var cls= proceedingJoinPoint.`this`.javaClass.interfaces


        Toast.makeText(context ,"aaaaaaaa" ,Toast.LENGTH_SHORT).show()


        lateinit var   clsName:String;

        for (i in  cls){


            if (i.name.equals("com.easyfuture.com.permission.PermissionCallBack")){

                clsName = i.name
            }

        }





        return proceedingJoinPoint.proceed()
    }
}


