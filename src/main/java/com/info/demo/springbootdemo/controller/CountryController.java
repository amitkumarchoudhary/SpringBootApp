package com.info.demo.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.springbootdemo.domain.Country;
import com.info.demo.springbootdemo.service.CountryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("country")
public class CountryController {

	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/details")
	public ResponseEntity<Country> getCountry(){
		
		List<Country> listOfCountry=countryService.getAllCountry();
		
		return new ResponseEntity(listOfCountry,HttpStatus.OK);
		
	}
}
