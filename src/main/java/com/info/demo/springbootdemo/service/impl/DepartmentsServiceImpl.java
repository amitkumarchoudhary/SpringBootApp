package com.info.demo.springbootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.DepartmentDao;
import com.info.demo.springbootdemo.domain.Departments;
import com.info.demo.springbootdemo.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService{

	@Autowired
	private DepartmentDao departmentsDao;
	
	@Override
	public List<Departments> getAllDepartments() {
		List<Departments> listofdepatments=departmentsDao.findAll();
		return listofdepatments;
	}

}
