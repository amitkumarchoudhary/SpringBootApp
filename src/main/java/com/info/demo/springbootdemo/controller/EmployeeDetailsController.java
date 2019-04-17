package com.info.demo.springbootdemo.controller;


import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.domain.UploadFileResponse;
import com.info.demo.springbootdemo.exception.RecordNotFoundException;
import com.info.demo.springbootdemo.exception.RequestParamNotFoundException;
import com.info.demo.springbootdemo.file.LoadFileStoreLocationService;
import com.info.demo.springbootdemo.file.impl.FileStorageServiceImpl;
import com.info.demo.springbootdemo.form.EmployeeForm;
import com.info.demo.springbootdemo.form.ObjectKey;
import com.info.demo.springbootdemo.service.EmployeeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins="*")
@RestController 
@RequestMapping(value="employee/details")
public class EmployeeDetailsController {

private Logger logger=Logger.getLogger(LandingPageController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private LoadFileStoreLocationService loadFileStoreLocationService;
	
	@Autowired
	private FileStorageServiceImpl fileStorageService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@RequestMapping(value="/getAllEmployeeDetails" , method= RequestMethod.GET)
	@ApiOperation(value="Retrieve the user sign info given the user's id")
    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "Successfully retrieved all user data info"),
            @ApiResponse(code = 404, message = "No data is found", response = String.class)
    })
	@GetMapping
	public ResponseEntity<Employee> getAllEmployeeDetails(){	
		
		List<Employee> ss = null;
		try {
			 ss= employeeService.getAllEmployeeService();
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@ApiOperation(value="Retrieve the user sign info given the user's id")
//    @ApiResponses(value ={
//            @ApiResponse(code = 200, message = "Successfully retrieved user sign info"),
//            @ApiResponse(code = 204, message = "No user sign info found", response = String.class)
//    })
//	@RequestMapping(value="/getempdetailsbyid/{id}" , method= RequestMethod.GET)
	
	@GetMapping(value="userById")
	public ResponseEntity<Employee> getEmployeeDetails(
				@RequestParam(value = "first_name"  ,required = false  ) String first_name,
				@RequestParam(value = "createdDate" , required = false) String createdDate,
				@RequestParam(value = "employee_id" ,required = false ) Integer employee_id
				
				){
		
		Employee objEmployee = null;
		try {
						     
				if(createdDate!=null){
						 
					objEmployee=employeeService.getEmployeeByCreateDateService(createdDate);
				   return new ResponseEntity(objEmployee,HttpStatus.OK); 
				}
				
				if(first_name!=null){
					
					 return new ResponseEntity(first_name,HttpStatus.OK); 
			   }
				
			   if(employee_id!=null){
					 
					objEmployee=employeeService.getEmployeeByIdService(employee_id);
					 return new ResponseEntity(objEmployee,HttpStatus.OK); 
			   }
				
			   if(employee_id!=null  &&  createdDate!=null){
			    	 
				   objEmployee= employeeService.getEmployeeServiceByIdDate(employee_id ,createdDate);
			    	 return new ResponseEntity(objEmployee,HttpStatus.OK); 
			    	 
			   } else{
			    	 throw new RequestParamNotFoundException("Invalid url request not valid ........");
			     }
			     
//				 if(ss==null){
//					 throw new RequestParamNotFoundException("Invalid url request not valid ........");
//				
//					 
//				 }
				
				 
//				 if(id > 0){
////					 throw new RecordNotFoundException("Invalid employee id : " + id);
//					 ss= employeeService.getEmployeeServiceByIdDate(id);
//					 
//				 }
//			         return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			         return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/saveEmployeeDetails" , method= RequestMethod.POST)
//	public ResponseEntity saveEmployeeDetails(@RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,@RequestBody EmployeeForm empForm){
	public ResponseEntity saveEmployeeDetails(@RequestBody EmployeeForm empForm){	
		
		try {
			  employeeService.saveEmployeeService(empForm);
			 String file= loadFileStoreLocationService.loadFileLocation(empForm.getFilelocation());
			 logger.info("LandingPageController........................."+file);
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
	
	private void  uploadFile(MultipartFile file){
		 String fileName = fileStorageService.storeFile(file);

	        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
	                .path("/downloadFile/")
	                .path(fileName)
	                .toUriString();

	       
	}
	
	
	
	@PostMapping(value="userByIdDate")
	public ResponseEntity<Employee> getEmployeeDetailsData(@RequestBody ObjectKey objectKey){
		
		Employee objEmployee = null;
		try {
			
			
			   if(objectKey.getEmployee_id()!=null  &&  objectKey.getCreatedDate()!=null){
		    	 
				   objEmployee= employeeService.getEmployeeServiceByIdDate(objectKey.getEmployee_id() ,objectKey.getCreatedDate());
			    	 return new ResponseEntity(objEmployee,HttpStatus.OK); 
			    	 
			   }
			   
			   if(objectKey.getEmployee_id()!=null){
					 
					objEmployee=employeeService.getEmployeeByIdService(objectKey.getEmployee_id());
					 return new ResponseEntity(objEmployee,HttpStatus.OK); 
			   }
						     
				
				
				if(objectKey.getFirst_name()!=null){
					
					 return new ResponseEntity(objectKey.getFirst_name(),HttpStatus.OK); 
			   }
				
			   if(objectKey.getCreatedDate()!=null){
					 
					objEmployee=employeeService.getEmployeeByCreateDateService(objectKey.getCreatedDate());
				   return new ResponseEntity(objEmployee,HttpStatus.OK); 
			   }
				
			  
				
			    else{
			    	 throw new RequestParamNotFoundException("Invalid url request not valid ........");
			     }
			     
//				 if(ss==null){
//					 throw new RequestParamNotFoundException("Invalid url request not valid ........");
//				
//					 
//				 }
				
				 
//				 if(id > 0){
////					 throw new RecordNotFoundException("Invalid employee id : " + id);
//					 ss= employeeService.getEmployeeServiceByIdDate(id);
//					 
//				 }
//			         return new ResponseEntity(ss,HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("Error adding LandingPageController", e);
			         return new ResponseEntity(e,HttpStatus.INTERNAL_SERVER_ERROR);
			 
		}
		
	}
	
	
	
    @RequestMapping(value="/getempdetailsbyid/{id}" , method= RequestMethod.GET)
//	@GetMapping(value="userId")
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable Integer id){
	
    	Employee ee=null;
    	
    	try {
			
    		if( id!=null){  
    			ee=employeeService.getEmployeeByIdService(id);
        		
    		  return new ResponseEntity(ee,HttpStatus.OK);
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
