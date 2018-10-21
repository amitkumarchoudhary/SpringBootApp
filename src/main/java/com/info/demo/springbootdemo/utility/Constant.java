package com.info.demo.springbootdemo.utility;

public class Constant {

	private Constant() {
	}

	/* Start Variables */
	public static final String FETCH_BY_ID = "SELECT * from employee where id=? ";
	
	public static final String FETCH_BY_All = "SELECT * from employee ";
	
	public static final String FETCH_BY_ID_Both ="SELECT  ads.name from employee e, address ads where e.id=2";
}
