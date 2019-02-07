package com.info.demo.springbootdemo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.entityconvertdomain.EmployeeEntity;
import com.info.demo.springbootdemo.entitytomapper.EmployeeEntityToMapper;
import com.info.demo.springbootdemo.service.impl.EmployeeJPAServiceImpl;
@CrossOrigin(origins="*")
@RestController
public class EmployeeJPAController {

	private Logger logger=Logger.getLogger(EmployeeJPAController.class);
	
	@Autowired
	private EmployeeEntityToMapper employeeEntityToMapper;
	
	@Autowired
	private EmployeeJPAServiceImpl employeeJPAServiceImpl;
	
	@GetMapping(value="/getAllEmployeeDetailsJPA")
	public ResponseEntity<Employee> getAllEmployeeDetails(){
		
		
		//List<EmployeeEntity> ss = null;
		List<Employee> ss = null;
		try {
			 ss= employeeJPAServiceImpl.findAllUserDetailsService();
			 //ss=employeeEntityToMapper.getEntityToMapper(employeeJPAServiceImpl.findAllUserDetailsService());
			 
			 if(ss==null){
				 logger.info("data is not availble....."+ss);
				 new ResponseEntity(HttpStatus.NOT_FOUND);
			 } 
			 
			   return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			   return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
}
