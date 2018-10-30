package com.easyfuture.com.app

import android.app.Activity
import android.app.Application
import com.easyfuture.com.compone.DaggerDaggerConpont
import com.easyfuture.com.modul.ApplicationModul
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class   AopApplication:Application() ,HasActivityInjector{


    @Inject
    lateinit var   dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        init()


    }
    private fun init() {
        DaggerDaggerConpont.builder()
            .AopApplication(this)
            .ApplicationModul(ApplicationModul(this))
            .build()
            .inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> {


        return  dispatchingAndroidInjector;
    }







}