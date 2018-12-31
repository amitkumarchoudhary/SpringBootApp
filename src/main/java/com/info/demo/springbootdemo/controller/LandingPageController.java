package com.info.demo.springbootdemo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.exception.ServiceDemoException;
import com.info.demo.springbootdemo.form.EmployeeForm;
import com.info.demo.springbootdemo.service.EmployeeService;
import com.info.demo.springbootdemo.service.impl.EmploeeServiceImpl;

@CrossOrigin(origins="*")
@RestController
public class LandingPageController {

	private Logger logger=Logger.getLogger(LandingPageController.class);
	
	@Value(value="${welcome.message}")
	private String welcomemessage;

	
	@RequestMapping("/")
	public String getLandingpage(){
		logger.info("LandingPageController getLandingpage called...");
		return welcomemessage;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse/use")
	public String sayHello2() {
		return "Swagger Hello World 2";
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/api/javainuse/saveEmployeeDetailsswag" , method= RequestMethod.POST)
	public ResponseEntity saveEmployeeDetailsswag(@RequestBody EmployeeForm empForm){
		
		
		try {
			  
			logger.info("LandingPageController....."+empForm);
			
			return new ResponseEntity(empForm,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
}
