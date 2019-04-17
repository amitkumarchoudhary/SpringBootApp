package com.info.demo.springbootdemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.RegionsDao;
import com.info.demo.springbootdemo.domain.Regions;
import com.info.demo.springbootdemo.service.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService{

	@Autowired
	private RegionsDao regionsDao;
	
	
	@Override
	public List<Regions> getRegionService() {
		
		List<Regions> regions=regionsDao.findAll();
		return regions;
	}

	
}
