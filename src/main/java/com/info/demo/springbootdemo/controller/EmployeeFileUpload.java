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

import com.info.demo.springbootdemo.domain.FileUploadForm;
import com.info.demo.springbootdemo.form.EmployeeForm;

@CrossOrigin(origins="*")
@RestController
public class EmployeeFileUpload {

private Logger logger=Logger.getLogger(LandingPageController.class);
	

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/getfileupload" , method= RequestMethod.POST)
	public ResponseEntity uploadEmployeeDetails(@RequestBody FileUploadForm uploadForm){
		
		
		logger.info("file upload is here...."+uploadForm);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	

		
	
	
	
	
	
}
