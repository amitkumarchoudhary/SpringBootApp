package com.info.demo.springbootdemo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.PermissionDao;
import com.info.demo.springbootdemo.domain.Permission;
import com.info.demo.springbootdemo.service.PermissionService;

@Transactional
@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private PermissionDao permissionDao;
	
	@Override
	public Permission getPermissionService(Integer id) {
		
		Permission OBJ=permissionDao.findOne(id);
		System.out.println("OBJ from permission data...."+OBJ);
		return OBJ ;
	}

//	@Override
//	public Permission getPermissionService(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
