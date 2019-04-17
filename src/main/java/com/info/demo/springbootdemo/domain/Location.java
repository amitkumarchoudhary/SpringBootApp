package com.info.demo.springbootdemo.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Location {

	@Id
	private Integer location_id;
	private String  street_adress;
	private String  postal_code;
	private String city;
	private String state_province;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "country_id")
	private Country country_id;

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public String getStreet_adress() {
		return street_adress;
	}

	public void setStreet_adress(String street_adress) {
		this.street_adress = street_adress;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public Country getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Country country_id) {
		this.country_id = country_id;
	}

	@Override
	public String toString() {
		return "Location [location_id=" + location_id + ", street_adress=" + street_adress + ", postal_code="
				+ postal_code + ", city=" + city + ", state_province=" + state_province + ", country_id=" + country_id
				+ "]";
	}

	


	
	
	
	
	
	
	
	
	
	
}
