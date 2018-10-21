package com.info.demo.springbootdemo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.service.EmployeeServiceJD;

@CrossOrigin(origins="*")
@RestController
public class EmployeeDetailsControllerJD {

private Logger logger=Logger.getLogger(LandingPageController.class);
	
	@Autowired
	private EmployeeServiceJD employeeServiceJD;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/getempdetailsbyidJD/{id}" , method= RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("id") int id){
		
		Employee ss = null;
		try {
			
			 ss= employeeServiceJD.getEmployeeService(id);
				 if(ss==null){
					 logger.info("LandingPageController....."+ss);
					 return new ResponseEntity(ss,HttpStatus.NOT_FOUND);
					 
				 }
			     
			
			return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/getAllempdetailsbyidJD" , method= RequestMethod.GET)
	public ResponseEntity<Employee> getAllJDEmployeeDetails(){
		
		List<Employee> ss = null;
		try {
			
			 ss= employeeServiceJD.getAllJDEmployeeService();
				 if(ss==null){
					 logger.info("LandingPageController....."+ss);
					 return new ResponseEntity(ss,HttpStatus.NOT_FOUND);
					 
				 }
			     
			
			return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
}
