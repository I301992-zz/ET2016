package com.sap.training.mvc.controller;

import java.util.ArrayList;
import java.util.List;

public class CollegeList {

	public List<College> colList = new ArrayList<College>();
	public List<String> course=new ArrayList<String>();

	public CollegeList(){
		course.add("CSE");
		course.add("ECE");
		course.add("MECH");
		colList.add(new College("ASE","I321","KERALA",course));
		colList.add(new College("CET","I311","KERALA",course.subList(0, 1)));
		
	
		
	}

	public List<College> getcolList() {
		return colList;
	}

	public void setcolList(List<College> colList) {
		this.colList=colList;
	}
	
	public void addAttribute(College college){
		colList.add(college);
	}
}
