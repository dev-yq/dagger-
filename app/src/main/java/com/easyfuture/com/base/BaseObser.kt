package com.easyfuture.com.base
import io.reactivex.functions.Consumer

abstract  class  BaseObser< T > ( var  baseNavators: BaseNavator)  : Consumer<T> {

    abstract   fun   sucess(t: T);
    override fun accept(t: T) {
        sucess(t);


    }



}