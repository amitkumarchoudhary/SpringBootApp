package com.info.demo.springbootdemo.controller;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.domain.Regions;
import com.info.demo.springbootdemo.exception.RequestParamNotFoundException;
import com.info.demo.springbootdemo.form.ObjectKey;
import com.info.demo.springbootdemo.form.RegionObjectKey;
import com.info.demo.springbootdemo.service.RegionsService;

@CrossOrigin(origins="*")
@RestController 
@RequestMapping(value="region/details")
public class RegionController {

	private Logger logger=Logger.getLogger(RegionController.class);
	
	@Autowired
	private RegionsService regionsService;
	
//	@GetMapping(produces="application/json")
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Regions> getRegion(){
		 
		List<Regions> regions=regionsService.getRegionService();
		logger.info("...regions..."+regions);
		return new ResponseEntity(regions,HttpStatus.OK);
		
		
		
	}
}
