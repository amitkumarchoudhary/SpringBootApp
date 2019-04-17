package com.info.demo.springbootdemo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departments {

	@Id
	private Integer department_id;
	private String department_name;
	private Integer manager_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "location_id")
	private Location location_id;

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}

	public Location getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Location location_id) {
		this.location_id = location_id;
	}

	@Override
	public String toString() {
		return "Departments [department_id=" + department_id + ", department_name=" + department_name + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
