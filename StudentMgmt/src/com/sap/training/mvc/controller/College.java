package com.sap.training.mvc.controller;

import java.util.List;

public class College{

	private String name;
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	private String id;
	private String address;
	private List<String> courses;
	public String getName() {
		return name;
	}
	College(){
		
	}
	College(String name, String id, String address,List<String> course) {
		//super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.courses=course;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return name + " "+ id + " "+ address+" "+courses;
	}
	
	
	
	
	
}
