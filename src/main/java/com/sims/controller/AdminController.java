package com.sims.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sims.serviceInterface.UserServiceInterface;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired(required = true)
	private UserServiceInterface userservice;
	static int userSessionId;

	@RequestMapping(method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		return "adminHome";
	}

	@RequestMapping("homeFrame")
	public String getHomeFrame(HttpServletRequest request, Model model) {
		return "homeFrame";
	}

	@RequestMapping("addRecord")
	public String getAddRecordPage(HttpServletRequest request, Model model) {
		return "addRecord";
	}
	
	@RequestMapping("addClass")
	public String getAddClassPage(HttpServletRequest request, Model model) {
		return "addClass";
	}
	
	@RequestMapping("addParent")
	public String getAddParentPage(HttpServletRequest request, Model model) {
		return "addParent";
	}
	
	@RequestMapping("addStudent")
	public String getAddStudentPage(HttpServletRequest request, Model model) {
		return "addStudent";
	}
	
	@RequestMapping("addSubject")
	public String getAddSubjectPage(HttpServletRequest request, Model model) {
		return "addSubject";
	}
	
	@RequestMapping("addFacuty")
	public String getAddFacultyPage(HttpServletRequest request, Model model) {
		return "addFaculty";
	}
}
