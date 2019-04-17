package com.info.demo.springbootdemo.form;

public class ObjectKey {

	private String first_name;
	private String createdDate;
	private Integer employee_id;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "ObjectKey [first_name=" + first_name + ", createdDate=" + createdDate + ", employee_id=" + employee_id
				+ "]";
	}
	
	
}
