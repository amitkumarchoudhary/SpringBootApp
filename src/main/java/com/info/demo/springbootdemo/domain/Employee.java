package com.info.demo.springbootdemo.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
//@Table(name="Employee")
public class Employee implements Serializable {

//	private Logger logger=Logger.getLogger(Employee.class);
	
	private static final long serialVersionUID = 1L;
	
	
	
	public Employee(Integer id, String name, Double salary, String address, String filelocation, String createdDate,
		String updatedDate) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.address = address;
	this.filelocation = filelocation;
	this.createdDate = createdDate;
	this.updatedDate = updatedDate;
}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private Integer id;
	private String name;
	private Double salary;
	private String address;
	private String filelocation;
	private String createdDate;
	private String updatedDate;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFilelocation() {
		return filelocation;
	}
	public void setFilelocation(String filelocation) {
		this.filelocation = filelocation;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", filelocation=" + filelocation + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ "]";
	}
	
	
	
	
	
	
	
}
