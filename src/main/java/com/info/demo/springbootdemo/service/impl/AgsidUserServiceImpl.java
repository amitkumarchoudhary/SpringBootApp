package com.info.demo.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.info.demo.springbootdemo.dao.AgsidUserDao;
import com.info.demo.springbootdemo.domain.AgsidUser;
import com.info.demo.springbootdemo.form.LoginForm;
import com.info.demo.springbootdemo.service.AgsidUserService;

@Transactional
@Service
public class AgsidUserServiceImpl implements AgsidUserService{

	@Autowired
	private AgsidUserDao agsidUserDao;
	
	@Override
	public void saveAgsidUser(LoginForm loginForm) {
		
		AgsidUser agsidobj=new AgsidUser();
		agsidobj.setUserId(loginForm.getUserId());
		
		agsidUserDao.save(agsidobj);
		
	}

}
