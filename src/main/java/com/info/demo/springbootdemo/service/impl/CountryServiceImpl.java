package com.info.demo.springbootdemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.demo.springbootdemo.dao.CountryDao;
import com.info.demo.springbootdemo.domain.Country;
import com.info.demo.springbootdemo.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countryDao;
	
	@Override
	public List<Country> getAllCountry() {
		List<Country> listofcountry=countryDao.findAll();
		return listofcountry;
	}

}
