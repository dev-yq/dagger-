package com.easyfuture.com.utils


import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


/*
* 线程调度
* */
class  RxScduler{

companion object {
    fun <T> applySchedulers(): ObservableTransformer<T, T> {

        return ObservableTransformer{
            upstream ->
            upstream.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

        }



    }



}
}