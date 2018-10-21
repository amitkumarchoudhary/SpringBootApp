package com.info.demo.springbootdemo.form;

public class LoginForm {

	private Integer id;
	private String password;
	private String email;
	private String address;
	private Integer mobile;
	
	
	
	public Integer getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public Integer getMobile() {
		return mobile;
	}
	@Override
	public String toString() {
		return "LoginForm [id=" + id + ", password=" + password + ", email=" + email + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
	
	
			
}
