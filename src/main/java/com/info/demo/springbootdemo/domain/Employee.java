package com.info.demo.springbootdemo.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
//@Table(name="Employee")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Employee() {
		super();
	}
	
	@Id
	private Integer employee_id;
	private String  first_name;
	private String  last_name;
	private String  email;
	private String  phone_number;
	private Double  salary;
	private String  filelocation;
	private String created_Date;
	private String updated_Date;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Departments department_id;

	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getFilelocation() {
		return filelocation;
	}
	public void setFilelocation(String filelocation) {
		this.filelocation = filelocation;
	}
	public String getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(String created_Date) {
		this.created_Date = created_Date;
	}
	public String getUpdated_Date() {
		return updated_Date;
	}
	public void setUpdated_Date(String updated_Date) {
		this.updated_Date = updated_Date;
	}
	public Departments getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Departments department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", salary=" + salary + ", filelocation="
				+ filelocation + ", created_Date=" + created_Date + ", updated_Date=" + updated_Date
				+ ", department_id=" + department_id + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
