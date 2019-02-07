package com.info.demo.springbootdemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.EmployeeDaoJPA;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.service.EmployeeJPAService;

@Service
public class EmployeeJPAServiceImpl implements EmployeeJPAService{

	
	@Autowired
	private EmployeeDaoJPA employeeDaoJPA ;
	
	
	@Override
	public List<Employee> findAllUserDetailsService() {
		
		return employeeDaoJPA.findAllUserDetails();
	}

}
