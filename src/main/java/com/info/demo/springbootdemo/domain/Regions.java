package com.info.demo.springbootdemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Regions{

	@Id
	private Integer region_id;
	private String region_name;
	
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	@Override
	public String toString() {
		return "Regions [region_id=" + region_id + ", region_name=" + region_name + "]";
	}
	
	
	
}
