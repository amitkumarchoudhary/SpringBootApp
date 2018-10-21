package com.info.demo.springbootdemo.dao;

import java.util.List;

import com.info.demo.springbootdemo.domain.Employee;

public interface EmployeeDaoJD extends java.util.function.IntFunction<Employee>{
	
	Employee findUserById(int userId);
	
	default Employee apply(int arg0) {
		return null;
	}

	List<Employee> findUserByJDAll();

}
