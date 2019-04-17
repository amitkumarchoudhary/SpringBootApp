package com.info.demo.springbootdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.exception.RequestParamNotFoundException;
import com.info.demo.springbootdemo.form.RegionObjectKey;


@CrossOrigin(origins="*")
@RestController 
@RequestMapping(value="filterby")
public class EmployeeFilterByRegionCountryLocation {

private Logger logger=Logger.getLogger(RegionController.class);
	
	
	@PostMapping(value="region/country/location")
	public ResponseEntity<Employee> getRegionCountryLocation(@RequestBody RegionObjectKey objectKey){
		
		Employee objEmployee = null;
		try {
			
			
			   if(objectKey.getRegion()!=null  &&  objectKey.getCountry()!=null  && objectKey.getLocation()!=null){
		    	 
				   logger.info("Region   Country  Location" + objectKey.getRegion() +"...."+objectKey.getCountry()+"......."+objectKey.getLocation());
			    	 return new ResponseEntity(HttpStatus.OK); 
			    	 
			   }
			   
			   if(objectKey.getRegion()!=null){
					 
				   logger.info("Region...... " + objectKey.getRegion());
					 return new ResponseEntity(HttpStatus.OK); 
			   }
						     
				
				
				if(objectKey.getCountry()!=null){
					
					logger.info("Country...... " + objectKey.getCountry());
					 return new ResponseEntity(HttpStatus.OK); 
			   }
				
			   if(objectKey.getLocation()!=null){
					 
				   logger.info("Location...... " + objectKey.getLocation());	
				   return new ResponseEntity(HttpStatus.OK); 
			   }
				
			  
				
			    else{
			    	 throw new RequestParamNotFoundException("Invalid url request not valid ........");
			     }
			     
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			         return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
}
