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
import com.info.demo.springbootdemo.form.EmployeeForm;
import com.info.demo.springbootdemo.service.EmployeeService;

@CrossOrigin(origins="*")
@RestController
public class EmployeeDetailsController {

private Logger logger=Logger.getLogger(LandingPageController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/getempdetailsbyid/{id}" , method= RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("id") int id){
		
		Employee ss = null;
		try {
			
			 ss= employeeService.getEmployeeService(id);
				 if(ss==null){
					 logger.info("LandingPageController.........."+ss);
					 return new ResponseEntity(ss,HttpStatus.NOT_FOUND);
					 
				 }
			     
			
			return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/getAllEmployeeDetails" , method= RequestMethod.GET)
	public ResponseEntity<Employee> getAllEmployeeDetails(){
		
		List<Employee> ss = null;
		try {
			 ss= employeeService.getAllEmployeeService();
			 if(ss==null){
				 new ResponseEntity(ss,HttpStatus.NOT_FOUND);
			 }
			logger.info("LandingPageController....."+ss);
			
			return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/saveEmployeeDetails" , method= RequestMethod.POST)
	public ResponseEntity saveEmployeeDetails(@RequestBody EmployeeForm empForm){
		
		
		try {
			  employeeService.saveEmployeeService(empForm);
			logger.info("LandingPageController.....");
			
			return new ResponseEntity(empForm,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/deleteEmployeeDetails/{id}" , method= RequestMethod.DELETE)
	public ResponseEntity deleteEmployeeDetails(@PathVariable("id") Integer id){
		
		
		try {
			  employeeService.deleteEmployeeService(id);
			logger.info("LandingPageController.....");
			
			return new ResponseEntity(id,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/updateEmployeeDetails" , method= RequestMethod.PUT)
	public ResponseEntity updateEmployeeDetails(@RequestBody EmployeeForm empForm){
		
			
			try {
				  employeeService.updateEmployeeService(empForm);
				logger.info("updateEmployeeDetails....."+empForm);
				
				return new ResponseEntity(HttpStatus.OK);
			} catch (Exception e) {
				logger.debug("Error adding LandingPageController", e);
				return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
				 
			}
			 
	}
		
	
	
	
	
	
}
