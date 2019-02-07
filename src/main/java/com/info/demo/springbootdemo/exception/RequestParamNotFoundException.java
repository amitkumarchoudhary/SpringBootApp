package com.info.demo.springbootdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequestParamNotFoundException extends RuntimeException{
	
	private String exception;
	
	public RequestParamNotFoundException(String exception){
		super(exception);
	}

}
