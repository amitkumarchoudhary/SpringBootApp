package com.info.demo.springbootdemo.form;

public class LoginForm {

	private Integer userId;
	private String password;
	private String email;
	private String address;
	private Integer mobile;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "LoginForm [userId=" + userId + ", password=" + password + ", email=" + email + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
	
	
	
	
	
	
			
}
