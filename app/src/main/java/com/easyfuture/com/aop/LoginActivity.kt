package com.easyfuture.com.aop


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.widget.*
import butterknife.BindView
import butterknife.OnClick
import com.easyfuture.com.base.BaseActivity
import com.easyfuture.com.logger.LoggerFactory
import javax.inject.Inject

/*
 *
 * 登录
 **/

class LoginActivity :BaseActivity() ,LoginNavator{
    override fun loginSuccess() {}

    @Inject
   lateinit  var  loginViewModel:LoginViewModel
    @BindView(R.id.password)
   lateinit var  password:EditText

    @BindView(R.id.email)
    lateinit var email: AutoCompleteTextView
    override fun getLayout(): Int {

        return   R.layout.activity_login
    }

    override fun initData() {
        loginViewModel.setNavigator(this)

        loginViewModel.getMutableLiveData().observe(this ,Observer<String?>{s->kotlin.run {
            LoggerFactory.d(s)


        }

        })
    }

    override fun initView() {

    }

    @OnClick(R.id.email_sign_in_button)
    fun    login(){
        loginViewModel.login(email.text.toString() ,password.text.toString())

    }



}
