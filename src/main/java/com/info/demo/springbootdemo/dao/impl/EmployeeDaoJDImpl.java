package com.info.demo.springbootdemo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.info.demo.springbootdemo.dao.EmployeeDaoJD;
import com.info.demo.springbootdemo.domain.Employee;
import com.info.demo.springbootdemo.mapper.EmployeeMapper;
import com.info.demo.springbootdemo.utility.Constant;

@Repository
@Transactional
public class EmployeeDaoJDImpl implements EmployeeDaoJD{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Employee findUserById(int userId) {
		return jdbcTemplate.queryForObject(Constant.FETCH_BY_ID, new Object[]{userId},new EmployeeMapper());
	}
	
	@Override
	public List<Employee> findUserByJDAll() {
		return jdbcTemplate.query(Constant.FETCH_BY_All,new EmployeeMapper());
	}
	
	
	
}
