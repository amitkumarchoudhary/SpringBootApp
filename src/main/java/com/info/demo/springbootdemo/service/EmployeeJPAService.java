package com.info.demo.springbootdemo.service;

import java.util.List;

import com.info.demo.springbootdemo.domain.Employee;

public interface EmployeeJPAService {

	 List<Employee> findAllUserDetailsService();
	 
	 List<Employee> findUserRegionByService(Integer region_id);
	 
	 List<Employee> findUserRegionByDefaultService();
}
