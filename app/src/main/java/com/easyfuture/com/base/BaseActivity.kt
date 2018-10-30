package com.easyfuture.com.base

import android.arch.lifecycle.ViewModel
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager

import android.net.ConnectivityManager.CONNECTIVITY_ACTION
import android.net.NetworkInfo
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.Unbinder
import com.easyfuture.com.logger.LoggerFactory
import com.easyfuture.com.utils.ToastUtils
import com.easyfuture.com.utils.ToastUtils.Companion.shortShow
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import java.util.*

abstract  class  BaseActivity:AppCompatActivity(),BaseNavator{
    abstract  fun   getLayout():Int
    abstract   fun   initData()
    abstract   fun   initView()

    lateinit var  butterKnife: Unbinder



    val  broadcastReceiver:NetReciver by  lazy{

        NetReciver()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        butterKnife = ButterKnife.bind(this)
         var  intentFilter:IntentFilter = IntentFilter()
        initData()
        initView()
        intentFilter.addAction(CONNECTIVITY_ACTION)
        registerReceiver(broadcastReceiver ,intentFilter)


    }
    //监听网络连接状态
      inner  class   NetReciver :BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {

            if (intent!!.action.equals(CONNECTIVITY_ACTION)){
                var connect: ConnectivityManager = context!!.getSystemService(CONNECTIVITY_SERVICE ) as  ConnectivityManager


                var    connectInfo:NetworkInfo? = connect.activeNetworkInfo



                if (connectInfo==null){

                    shortShow("当前网络不可用，请检查你的网络设置")

                }

            }
        }

    }


    override fun onDestroy() {
        super.onDestroy()

        unregisterReceiver(broadcastReceiver)
        butterKnife.unbind()
    }



    override fun throwError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun complete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun checkCodeError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun userNotExit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun userPasswordError() {


       shortShow("用户密码错误")
    }




}



