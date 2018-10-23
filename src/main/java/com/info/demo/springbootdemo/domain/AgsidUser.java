package com.info.demo.springbootdemo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class AgsidUser implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE , generator="employee_generator")
	@TableGenerator(name="employee_generator", 
	                table="agsid_pk_table", 
	                pkColumnName="name", 
	                valueColumnName="value",                            
	                allocationSize=100,
	                initialValue=101,
	                schema="agsid_user") 
	
	@Column(name="agsid",unique=true)
    private Integer agsid;
	
	private Integer userId;

	public Integer getAgsid() {
		return agsid;
	}

	public void setAgsid(Integer agsid) {
		this.agsid = agsid;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "AgsidUser [agsid=" + agsid + ", userId=" + userId + "]";
	}
	
	

	
	
	
	
	
}
