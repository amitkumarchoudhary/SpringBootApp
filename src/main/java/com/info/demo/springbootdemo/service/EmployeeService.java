package com.info.demo.springbootdemo.service;



import java.util.List;

import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.form.EmployeeForm;

public interface EmployeeService {

	public Employee getEmployeeServiceByIdDate(int employee_id ,String createdDate);
	public Employee getEmployeeByIdService(Integer employee_id);
	public Employee getEmployeeByCreateDateService(String createdDate);
	public List<Employee> getAllEmployeeService();
	public void saveEmployeeService(EmployeeForm ee);
	public void deleteEmployeeService(Integer ee);
	public void updateEmployeeService(EmployeeForm ee);
	
}
