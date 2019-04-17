package com.info.demo.springbootdemo.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Country {

	@Id
	private Integer country_id;
	
	private String country_name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "region_id")
	private Regions region_id;
	
	public Integer getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public Regions getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Regions region_id) {
		this.region_id = region_id;
	}
	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + ", region_id=" + region_id
				+ "]";
	}
	
	
	
	
}
