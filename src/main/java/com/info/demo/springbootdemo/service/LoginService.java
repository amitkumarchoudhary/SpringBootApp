package com.info.demo.springbootdemo.service;

import com.info.demo.springbootdemo.domain.Login;
import com.info.demo.springbootdemo.form.EmployeeForm;
import com.info.demo.springbootdemo.form.LoginForm;
import com.info.demo.springbootdemo.form.LoginSignForm;

public interface LoginService {

	public void saveLoginService(LoginForm ee);
	
	public Login getLoginService(LoginSignForm ee);
}
 