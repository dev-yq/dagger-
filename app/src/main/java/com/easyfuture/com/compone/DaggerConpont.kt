package com.easyfuture.com.compone

import android.app.Activity
import android.app.Application
import com.easyfuture.com.app.AopApplication
import com.easyfuture.com.modul.ActivityModul
import com.easyfuture.com.modul.ApplicationModul
import com.easyfuture.com.modul.HttpModul
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/*
* component
*
* */
@Singleton
@Component(modules = [AndroidInjectionModule::class   ,ApplicationModul::class ,HttpModul::class ,ActivityModul::class])
interface   DaggerConpont  {


    fun  inject(application: AopApplication)
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun   AopApplication(application: AopApplication):Builder
        fun ApplicationModul(applicationModul: ApplicationModul): Builder
        fun build(): DaggerConpont

    }



}