package com.info.demo.springbootdemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission {

	@Id
	private Integer id;
	private String name;
	private String usertype;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", usertype=" + usertype + "]";
	}
	
	
	
}
