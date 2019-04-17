package com.info.demo.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.springbootdemo.domain.Departments;
import com.info.demo.springbootdemo.service.DepartmentsService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("departments")
public class DepartmentsController {
	
	@Autowired
	private DepartmentsService departmentsService;
	
	@GetMapping("details")
	public ResponseEntity<Departments> getAllDepartments(){
		
		List<Departments> listofdepartments=departmentsService.getAllDepartments();
		return new ResponseEntity(listofdepartments,HttpStatus.OK);
		
	}

}
