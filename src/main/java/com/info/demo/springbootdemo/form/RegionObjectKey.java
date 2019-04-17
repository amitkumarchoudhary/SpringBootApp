package com.info.demo.springbootdemo.form;

public class RegionObjectKey {

	
	private Integer region;
	private String country;
	private Integer location;
	public Integer getRegion() {
		return region;
	}
	public void setRegion(Integer region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "RegionObjectKey [region=" + region + ", country=" + country + ", location=" + location + "]";
	}
	
	
	

	
	
}
