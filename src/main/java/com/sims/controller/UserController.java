package com.sims.controller;

import java.util.Iterator;
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
@RequestMapping("/")
public class UserController{
	
	@Autowired(required=true)
	private UserServiceInterface userservice;
	static int userSessionId;
 
   @RequestMapping(method = RequestMethod.GET)
   public String welcomePage(ModelMap model) {
      //model.addAttribute("message", "Hello Spring MVC Framework!");
      return "welcome";
   }
   
   @RequestMapping("home")
   public String validation(HttpServletRequest request, Model model){
	   String emailInput = request.getParameter("email").toLowerCase();
	   String passwordInput = request.getParameter("password");

	   List<User> user = userservice.validateUser();
	   
	   for (User userList : user) {
			if (userList.getEmail().equals(emailInput) && userList.getPassword().equals(passwordInput)) {
				userSessionId = userList.getUserId();
				int userIdentity = userList.getIdentity();
				String firstName = userList.getFirstName();
				HttpSession sess = request.getSession(); 
				sess.setAttribute("displayName", firstName);
				switch(userIdentity){
				case 201:
					return "studentHome";
				case 202:
					return "parentHome";
				case 203:
					return "facultyHome";
				case 204:
					return "adminHome";
				default:
					return "redirect:/";
				}
			}
	   }
	   return "redirect:/";
   }
   
	@RequestMapping("homeFrame")
	public String getHomeFrame(HttpServletRequest request, Model model) {
		return "homeFrame";
	}
	
	@RequestMapping("studentProfile")
	public String getStudentProfile(HttpServletRequest request, Model model){
		List<User> user = userservice.currentUser(userSessionId);
		for (User userList : user) {
			model.addAttribute("user", userList);
			@SuppressWarnings("unchecked")
			Set<Subject> subjects = (Set<Subject>) userList.getLecture().getSubjects();
			model.addAttribute("subjects", subjects);
		}
		return "studentProfile";
	}
	
	@RequestMapping("studentMarks")
	public String getStudentMarks(){
		return "studentMarks";
	}
	
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
}
