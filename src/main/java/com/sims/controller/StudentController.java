package com.sims.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sims.model.Subject;
import com.sims.model.User;
import com.sims.serviceInterface.UserServiceInterface;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("student")
public class StudentController{
	
	   @RequestMapping(method = RequestMethod.GET)
	   public String welcomePage(ModelMap model) {
	      return "studentHome";
	   }
	
	@Autowired(required=true)
	private UserServiceInterface userservice;
	static int userSessionId;

	@RequestMapping("homeFrame")
	public String getHomeFrame(HttpServletRequest request, Model model) {
		return "homeFrame";
	}
	
	@RequestMapping("studentProfile")
	public String getStudentProfile(HttpServletRequest request, Model model){
		List<User> user = userservice.currentUser(userSessionId);
		for (User userList : user) {
			model.addAttribute("user", userList);
			Set<Subject> subjects = (Set<Subject>) userList.getLecture().getSubjects();
			model.addAttribute("subjects", subjects);
		}
		return "studentProfile";
	}
	
	@RequestMapping("studentMarks")
	public String getStudentMarks(Model model){
		List<User> user = userservice.currentUser(userSessionId);
		for (User userList : user) {
			model.addAttribute("testName", userList.getStudentTest());
		}
		return "studentMarks";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("studentExamMarks")
	public String getStudentExamMarks(HttpServletRequest request, Model model){
		int examId = Integer.parseInt(request.getParameter("testx"));
		List<Object[]> subjectMarks = userservice.subjectMarks(userSessionId, examId);
		//System.out.println("----"+subjectMarks);
		
		for(Object[] row : subjectMarks){
			String subject = row[0].toString();
			String marks = row[1].toString();
			
			System.out.println(subject+"------"+marks);
		}
		
		return "studentExamMarks";
	}
	
/*	   @RequestMapping("testpage")
	   public String test(HttpServletRequest request, Model model){
		   System.out.println("---------"+request.getParameter("testx"));
		return "studentExamMarks";
	   }*/
	
	@RequestMapping("studentAssignment")
	public String getStudentAssignment(){
		return "studentAssignment";
	}
	
	@RequestMapping("studentAttendance")
	public String getStudentAttendance(){
		return "studentAttendance";
	}
	
	@RequestMapping("signout")
	public String getSignout(HttpSession session){
		session.invalidate();
		return "welcome";
	}
	
	@RequestMapping("addUser")
	public String getAddUser(HttpSession session){
		return "addStudent";
	}
}
