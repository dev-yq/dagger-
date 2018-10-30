package com.easyfuture.com.modul

import com.easyfuture.com.aop.LoginActivity
import com.easyfuture.com.aop.LoginModul

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
  abstract  class   ActivityModul{
 @ContributesAndroidInjector(modules = [LoginModul::class])
abstract   fun  bindActivity(): LoginActivity


}