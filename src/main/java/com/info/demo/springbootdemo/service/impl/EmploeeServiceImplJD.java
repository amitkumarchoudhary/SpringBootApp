package com.info.demo.springbootdemo.service.impl;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.info.demo.springbootdemo.dao.EmployeeDaoJD;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.service.EmployeeServiceJD;

@Transactional
@Service
public class EmploeeServiceImplJD implements EmployeeServiceJD{

	@Autowired
	private EmployeeDaoJD employeeDaoJD;
	
	@Override
	public Employee getEmployeeService(Integer id) {
		
		return employeeDaoJD.findUserById(id);
	}

	

}
