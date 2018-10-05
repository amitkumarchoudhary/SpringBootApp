package com.info.demo.springbootdemo.exception;

public class ServiceDemoException extends RuntimeException{

	private String name;
	public ServiceDemoException(String name){
		this.name=name;
	}

}
