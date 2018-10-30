package com.easyfuture.com.aop

import com.easyfuture.com.datasource.RepositoryFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class  LoginModul{


    @Provides
    fun   providerLogin(repositoryFactory: RepositoryFactory):LoginViewModel{
        return  LoginViewModel(repositoryFactory)
    }






}