package com.info.demo.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.demo.springbootdemo.dao.LoginDao;
import com.info.demo.springbootdemo.domain.Login;
import com.info.demo.springbootdemo.form.LoginForm;
import com.info.demo.springbootdemo.form.LoginSignForm;
import com.info.demo.springbootdemo.service.LoginService;


@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void saveLoginService(LoginForm ee) {
		Login ll=new Login();
		ll.setId(ee.getId());
		ll.setPassword(ee.getPassword());
		ll.setEmail(ee.getEmail());
		ll.setMobile(ee.getMobile());
		ll.setAddress(ee.getAddress());
		loginDao.save(ll);
		
	}

	@Override
	public Login getLoginService(LoginSignForm ee) {
		return loginDao.findOne(ee.getId());
	}

}
