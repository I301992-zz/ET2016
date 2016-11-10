package com.sap.training.mvc.controller;

import java.util.ArrayList;
import java.util.List;

public class Studentlist {

	public List<Student> stuList = new ArrayList<Student>();

	public Studentlist(){
		
		
		stuList.add(new Student("Aditya","N","i2132",22,2016,"CS","ASE"));
		stuList.add(new Student("Adi","N","i2192",22,2016,"CS","ASE"));
		stuList.add(new Student("Athira","N","i2112",22,2016,"CS","ASE"));
		stuList.add(new Student("Anandu","N","i2162",22,2016,"CS","CET"));
		stuList.add(new Student("Archana","N","i2172",22,2016,"CS","CET"));
		stuList.add(new Student("Abhi","N","i2182",22,2016,"CS","CET"));
		
	}
	public List<Student> getStudentList() {
		return stuList;
	}

	public void setStudentList(List<Student> studentList) {
		this.stuList = studentList;
	}
	
	public void addAttribute(Student student){
		stuList.add(student);
	}
}
