package com.info.demo.springbootdemo.service;

import java.util.List;

import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.form.EmployeeForm;

public interface EmployeeService {

	public Employee getEmployeeService(Integer id);
	public List<Employee> getAllEmployeeService();
	public void saveEmployeeService(EmployeeForm ee);
	public void deleteEmployeeService(Integer ee);
}
