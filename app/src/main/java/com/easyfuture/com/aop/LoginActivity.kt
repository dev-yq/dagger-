package com.easyfuture.com.aop


import android.widget.AutoCompleteTextView
import android.widget.EditText
import butterknife.BindView
import butterknife.OnClick
import com.easyfuture.com.base.BaseActivity
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

    }

    override fun initView() {

    }

    @OnClick(R.id.email_sign_in_button)
    fun    login(){
        loginViewModel.login(email.text.toString() ,password.text.toString())

    }


}
