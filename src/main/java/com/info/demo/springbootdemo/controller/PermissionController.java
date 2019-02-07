package com.info.demo.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.springbootdemo.domain.Permission;
import com.info.demo.springbootdemo.form.PermissionForm;
import com.info.demo.springbootdemo.service.PermissionService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/userpermission")
public class PermissionController {

	@Autowired
	private PermissionService permissionService;
	
	//@PostMapping(value="/permission")
	@RequestMapping(value="/permission" , method= RequestMethod.POST)
	public ResponseEntity getUserPersmission(@RequestBody PermissionForm permissionForm){
		
		Permission obj=permissionService.getPermissionService(permissionForm.getId());
		
		return new ResponseEntity(obj ,HttpStatus.OK);
	}
}
