package com.info.demo.springbootdemo.domain;

public class FileUploadForm {

	private String data;
	private String eno;
	private String name;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "FileUploadForm [data=" + data + ", eno=" + eno + ", name=" + name + "]";
	}
	
}
