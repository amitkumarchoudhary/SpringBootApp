package com.info.demo.springbootdemo.service;

import java.util.List;

import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.form.EmployeeForm;

public interface EmployeeServiceJD {

	public Employee getEmployeeService(Integer id);
	public List<Employee> getAllJDEmployeeService();
}
