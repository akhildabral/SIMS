package com.kesho.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kesho.model.User;
import com.kesho.serviceInterface.UserServiceInterface;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class UserController{
	
	@Autowired(required=true)
	private UserServiceInterface userservice;
 
   @RequestMapping(method = RequestMethod.GET)
   public String welcomePage(ModelMap model) {
      //model.addAttribute("message", "Hello Spring MVC Framework!");
      return "welcome";
   }
   
   @RequestMapping("home")
   public String validation(HttpServletRequest request){
	   String emailInput = request.getParameter("email");
	   String passwordInput = request.getParameter("password");

	   List<User> user = userservice.validateUser();
	   
	   for (User userList : user) {
			if (userList.getEmail().equals(emailInput) && userList.getPassword().equals(passwordInput)) {
				int userIdentity = userList.getIdentity();
				switch(userIdentity){
				case 201:
					return "studentHome";
				case 202:
					return "parentHome";
				case 203:
					return "facultyHome";
				default:
					return "redirect:/";
				}
			}
	   }
	   return "redirect:/";
   }
   
	@RequestMapping("/homeFrame")
	public String getHomeFrame(HttpServletRequest request, Model model) {
/*		httpSession = request.getSession();
		String name = (String) httpSession.getAttribute("firstName");
		model.addAttribute("name", name);
		UserController controller = new UserController();
		String QWE = controller.userName;
		model.addAttribute("QWE", QWE);*/
		return "homeFrame";
	}
	   
	   
	   
	/*   Iterator<User> itr = user.iterator();
	   while(itr.hasNext()){
		   Object obj = itr.next();
		   if(obj.equals(emailInput)){
			   System.out.println("data matched");
			   return "home";
		   }
		   else
			   System.out.println("record absent");
		   return "home";
	   }
	   return "redirect:/";
   }*/
}
