package com.info.demo.springbootdemo.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.EmployeeDao;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.exception.ServiceDemoException;
import com.info.demo.springbootdemo.form.EmployeeForm;
import com.info.demo.springbootdemo.service.EmployeeService;

@Transactional
@Service
public class EmploeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Override
	public Employee getEmployeeService(Integer id) {
		Employee ee=null;
		
		try {
			 ee=employeeDao.findOne(id);
		} catch (Exception e) {
			throw new ServiceDemoException("EmploeeServiceImpl getEmployeeService in null");
		}
		
		return ee;
	}


	@Override
	public List<Employee> getAllEmployeeService() {
             List<Employee> ee=null;
		
		try {
			 ee=employeeDao.findAll();
		} catch (Exception e) {
			throw new ServiceDemoException("EmploeeServiceImpl getAllEmployeeService in null");
		}
		
		return ee;
	}


	@Override
	public void saveEmployeeService(EmployeeForm empForm) {
		Employee ee=new Employee();
		ee.setId(empForm.getId());
		ee.setName(empForm.getName());
		ee.setSalary(empForm.getSalary());
		ee.setAddress(empForm.getAddress());
		ee.setFilelocation(empForm.getFilelocation());
		
		employeeDao.save(ee);
	}


	@Override
	public void deleteEmployeeService(Integer ee) {
		employeeDao.delete(ee);
		
	}


	@Override
	public void updateEmployeeService(EmployeeForm empForm) {
		Employee ee=new Employee();
		ee.setId(empForm.getId());
		ee.setName(empForm.getName());
		ee.setSalary(empForm.getSalary());
		ee.setAddress(empForm.getAddress());
		employeeDao.save(ee);
		
	}

	
}
