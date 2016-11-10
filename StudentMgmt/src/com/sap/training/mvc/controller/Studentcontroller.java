package com.sap.training.mvc.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studentcontroller {
	Studentlist s = new Studentlist();
	CollegeList c=new CollegeList();

	@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
	public String addStudent(@PathVariable("name") String name, ModelMap model) {

		List<Student> stuList = new ArrayList();
		List<Student> student_college = new ArrayList();
		//Studentlist s = new Studentlist();
		stuList = s.getStudentList();
		for (Student st : stuList) {
			if (st.getCollege().equals(name)) {
				student_college.add(st);
			}
		}
		model.addAttribute("studentlist", student_college);
        model.addAttribute("college",name);
		return "student";
	}

	@RequestMapping(value = "/beforeEdit", method = RequestMethod.GET)
	public ModelAndView edit(ModelMap model) {

		return new ModelAndView("Edit_Urn", "command", new Student());
	}

	@RequestMapping(value = "/Edit", method = RequestMethod.POST)
	public ModelAndView Edit(Student student, ModelMap model) {

		List<Student> student_detail = new ArrayList();
		student_detail = s.getStudentList();
		Iterator i = student_detail.iterator();
		for (Student st : student_detail) {

			if (st.getUrn().equals(student.getUrn())) {
				model.addAttribute("urn", student.getUrn());
				return new ModelAndView("EditCredentials", "command", new Student());
			}
		}
		model.addAttribute("message", "Invalid urn");
		return new ModelAndView("Edit_Urn", "command", new Student());
	}

	@RequestMapping(value = "/afterEdit", method = RequestMethod.POST)
	public String afterEdit(Student student, ModelMap model) {

		List<Student> student_detail = new ArrayList();
		student_detail = s.getStudentList();
		Iterator i = student_detail.iterator();
		for (Student st : student_detail) {

			System.out.println(student.getUrn() + "sdf");
			if (st.getUrn().equals(student.getUrn())) {
				System.out.println("sd");
				st.setFirstname(student.getFirstname());
				st.setLastname(student.getLastname());
				st.setAge(student.getAge());
				st.setBatchyear(student.getBatchyear());
				st.setStream(student.getStream());
				model.addAttribute("studentlist", student_detail);

			}
		}
		return "student";
	}

	@RequestMapping(value = "/addStudent/{college}", method = RequestMethod.GET)
	public ModelAndView addStudent(@PathVariable("college") String college,ModelMap model,Student student) {
        
		//model.addAttribute("college",student.getCollege());
	    model.addAttribute("college",college);
		return new ModelAndView("newstudent", "command", new Student());
	}

	// StudentMgmt/student/StudentMgmt
	@RequestMapping(value = "/displayStudent/{urn}", method = RequestMethod.GET)
	public String Display(@PathVariable("urn") String urn, ModelMap model) {
		// System.out.println("jsd");
		// ModelMap model = null;
		System.out.println("hai");
		List<Student> student_detail = new ArrayList();

		student_detail = s.getStudentList();
		Iterator i = student_detail.iterator();
		for (Student st : student_detail) {

			if (st.getUrn().equals(urn)) {
				model.addAttribute("student", st);
			}
		}
		return "DisplayStudent";
	}

	@RequestMapping(value = "/afterAdd/{college}", method = RequestMethod.POST)
	public String Add(@PathVariable("college") String college,Student student, ModelMap model) {
		//CollegeList c = new CollegeList();
		// if(student.getCollege().equals())
		
		if(student.getCollege().equals(college)){
			s.addAttribute(student);
			model.addAttribute("studentlist", s.getStudentList());
			return "student";
		}
		model.addAttribute("studentlist", s.getStudentList());
		model.addAttribute("message","Invalid college name");
		return "student";
		//System.out.println("sdf");
		
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView Delete(Student student, ModelMap model) {
		System.out.println("sdf");
		return new ModelAndView("Delete", "command", new Student());
	}

	@RequestMapping(value = "/afterDelete", method = RequestMethod.POST)
	public ModelAndView afterDelete(Student student, ModelMap model) {
		
		System.out.println("sd");
		for (Student st : s.getStudentList()) {

			if (student.getUrn().equals(st.getUrn())) {
				s.getStudentList().remove(st);
				model.addAttribute("studentlist", s.getStudentList());
				return new ModelAndView("student", "command", new Student());

			}
		}
		String message = "invalid urn";
		model.addAttribute("message", message);
		model.addAttribute("studentlist", s.getStudentList());
		return new ModelAndView("Delete", "command", new Student());
	}
}
