package com.easyfuture.com.base

import android.arch.lifecycle.ViewModel
import com.easyfuture.com.datasource.BaseRemoveDataSource
import com.easyfuture.com.datasource.BaseShareprefSource
import com.easyfuture.com.datasource.RepositoryFactory
import com.easyfuture.com.net.ApiService
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

abstract  class  BaseViewModel<T> constructor( private  val  repositoryFactor: RepositoryFactory)
    :ViewModel(){

    var   mCompositeDisposable:CompositeDisposable =  CompositeDisposable();
    lateinit var  weakReference:WeakReference<T>
    lateinit  var  comparable:CompositeDisposable

    override fun onCleared() {
        mCompositeDisposable.dispose()
        super.onCleared()
    }

    fun getRepositoryFactory(): RepositoryFactory {
        return repositoryFactor
    }

    fun getCompositeDisposable(): CompositeDisposable {
        return mCompositeDisposable
    }

    fun setNavigator(navigator: T) {

        this.weakReference = WeakReference(navigator)
    }



    fun getNavigator(): T {
        return weakReference.get()!!
    }



}