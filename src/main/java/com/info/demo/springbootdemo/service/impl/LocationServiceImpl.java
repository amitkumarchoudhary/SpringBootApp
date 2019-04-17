package com.info.demo.springbootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.LocationDao;
import com.info.demo.springbootdemo.domain.Location;
import com.info.demo.springbootdemo.service.LocationService;


@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationDao locationService;
	
	
	@Override
	public List<Location> getAllLocation() {
		List<Location> listOfLoactions=locationService.findAll();
		return listOfLoactions;
	}

}
