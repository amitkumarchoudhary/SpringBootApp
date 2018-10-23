package com.info.demo.springbootdemo.service;

import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.form.LoginForm;

public interface AgsidUserService {

	public void saveAgsidUser(LoginForm loginForm);
}
