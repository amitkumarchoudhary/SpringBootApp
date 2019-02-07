package com.info.demo.springbootdemo.entityconvertdomain;

public class EmployeeEntity {

	private Integer id;
	private String name;
	private Double salary;
	private String address;
	private String filelocation;
	
	
	
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



	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", filelocation=" + filelocation + "]";
	}
	
	
}
