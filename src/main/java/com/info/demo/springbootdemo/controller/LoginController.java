package com.info.demo.springbootdemo.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.domain.Login;
import com.info.demo.springbootdemo.form.EmployeeForm;
import com.info.demo.springbootdemo.form.LoginForm;
import com.info.demo.springbootdemo.form.LoginSignForm;
import com.info.demo.springbootdemo.service.AgsidUserService;
import com.info.demo.springbootdemo.service.EmployeeService;
import com.info.demo.springbootdemo.service.LoginService;

@CrossOrigin(origins="*")
@RestController
public class LoginController {

private Logger logger=Logger.getLogger(LoginController.class);
	
    @Autowired
    private LoginService loginService;	
    
    @Autowired
    private AgsidUserService agsidUserService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/saveloginform" , method= RequestMethod.POST)
	public ResponseEntity saveLoginData(@RequestBody LoginForm loginForm){
		
		logger.info("saveLoginData................"+loginForm);
		loginService.saveLoginService(loginForm);
		agsidUserService.saveAgsidUser(loginForm);
		
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/validlogin" , method= RequestMethod.POST)
	public ResponseEntity getLoginSignInfo(@RequestBody LoginSignForm loginSignForm){
		logger.info("getLoginSignInfo................"+loginSignForm);
		Login objLogin=loginService.getLoginService(loginSignForm);
		logger.info("objLogin is call...."+objLogin);
		if(objLogin!=null){
			if(objLogin.getUserId().equals(loginSignForm.getId()) && objLogin.getPassword().equals(loginSignForm.getPassword())){
				logger.info("User && PassWord is valid.........");
			return new ResponseEntity(objLogin,HttpStatus.OK);
			}else{
				logger.info("User || PassWord is Not  valid.......");
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}else{
			logger.info("objLogin is null.......");
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
		
}

