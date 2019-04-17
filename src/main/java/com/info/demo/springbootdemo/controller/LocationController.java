package com.info.demo.springbootdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.springbootdemo.domain.Location;
import com.info.demo.springbootdemo.service.LocationService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@GetMapping("/details")
	public ResponseEntity<Location> getAllLocation(){
		
		List<Location> listOfLoaction=locationService.getAllLocation();
		
		return new ResponseEntity(listOfLoaction,HttpStatus.OK);
		
	}
}
