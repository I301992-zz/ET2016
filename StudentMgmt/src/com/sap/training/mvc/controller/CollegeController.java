package com.sap.training.mvc.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollegeController {

	CollegeList s = new CollegeList();

	@RequestMapping(value = "/collegeList", method = RequestMethod.GET)
	public ModelAndView collegeList(ModelMap model) {
		List<College> colList = new ArrayList<College>();
		colList = s.getcolList();
		System.out.println(colList.get(0));
		model.addAttribute("collegelist", colList);
		return new ModelAndView("CollegeList", "command", new College());
	}

	@RequestMapping(value = "/beforecollegeEdit", method = RequestMethod.GET)
	public ModelAndView edit(ModelMap model) {

		return new ModelAndView("Edit_collegeid", "command", new College());
	}

	@RequestMapping(value = "/collegeEdit", method = RequestMethod.POST)
	public ModelAndView Edit(College college, ModelMap model) {

		List<College> college_detail = new ArrayList();
		college_detail = s.getcolList();
		Iterator i = college_detail.iterator();
		for (College st : college_detail) {

			if (st.getId().equals(college.getId())) {
				model.addAttribute("id", college.getId());
				System.out.println("colege");
				return new ModelAndView("EditCollegeCredentials", "command", new College());
			}
		}
		model.addAttribute("message", "Invalid id");
		return new ModelAndView("Edit_collegeid", "command", new College());
	}

	@RequestMapping(value = "/aftercollegeEdit", method = RequestMethod.POST)
	public String afterEdit(College college, ModelMap model) {

		List<College> college_detail = new ArrayList();
		college_detail = s.getcolList();
		Iterator i = college_detail.iterator();
		for (College st : college_detail) {

			// System.out.println(student.getUrn()+"sdf");
			if (st.getId().equals(college.getId())) {
				System.out.println("sd");
				// st.setName(college.getName());
				// st.setId(college.getId());
				st.setAddress(college.getAddress());
				st.setCourses(college.getCourses());
				System.out.println(college.getCourses());
				model.addAttribute("collegelist", college_detail);

			}
		}
		return "CollegeList";
	}

	@RequestMapping(value = "/addCollege", method = RequestMethod.GET)
	public ModelAndView addStudent(ModelMap model) {

		return new ModelAndView("newcollege", "command", new College());
	}

	@RequestMapping(value = "/aftercollegeAdd", method = RequestMethod.POST)
	public String Add(College college, ModelMap model) {
		s.addAttribute(college);
		System.out.println("sdf");
		model.addAttribute("collegelist", s.getcolList());
		// return new ModelAndView("CollegeList", "command", new College());
		return "CollegeList";
		// return "redirect:/StudentMgmt/CollegeList";
	}

	@RequestMapping(value = "/deleteCollege", method = RequestMethod.GET)
	public ModelAndView Delete(College college, ModelMap model) {
		;

		System.out.println("sdf");

		return new ModelAndView("DeleteCollege", "command", new College());
	}

	@RequestMapping(value = "/aftercollegeDelete", method = RequestMethod.POST)
	public ModelAndView afterDelete(College college, ModelMap model) {
		;
		System.out.println("sd");
		for (College c : s.getcolList()) {

			if (c.getId().equals(college.getId())) {
				s.getcolList().remove(c);
				model.addAttribute("collegelist", s.getcolList());
				return new ModelAndView("CollegeList", "command", new College());

			}
		}
		String message = "invalid id";
		model.addAttribute("message", message);
		model.addAttribute("collegelist", s.getcolList());
		return new ModelAndView("CollegeList", "command", new College());

	}
}
