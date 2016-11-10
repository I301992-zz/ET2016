package com.sap.training.mvc.controller;

import java.util.List;

public class Student {

	private String firstname;
	private String lastname;
	private String urn;
	private int age;
	private int batchyear;
	private String stream;
	private String password;
	private String college;
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	Student(){
		
	}
	Student(String fname,String lname,String urn,int age,int batchyear,String stream,String college){
		
		this.firstname=fname;
		this.lastname=lname;
		this.urn=urn;
		this.age=age;
		this.batchyear=batchyear;
		this.stream=stream;
		this.college=college;
		
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUrn() {
		return urn;
	}
	public void setUrn(String urn) {
		this.urn = urn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBatchyear() {
		return batchyear;
	}
	public void setBatchyear(int batchyear) {
		this.batchyear = batchyear;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return  firstname + " " + lastname + "      " + urn+" "+ age+" "+batchyear+"  "+stream+"\n";
	}
	
	
}
