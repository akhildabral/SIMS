package com.sims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sims.model.User;
import com.sims.serviceInterface.UserServiceInterface;

@Controller
@RequestMapping("/")
public class HomeController {
 
	@Autowired(required=true)
	private UserServiceInterface userservice;
	static int userSessionId;
	
   @RequestMapping(method = RequestMethod.GET)
   public String welcomePage(ModelMap model) {
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
					return "redirect:/student";
				case 202:
					return "redirect:/parent";
				case 203:
					return "redirect:/faculty";
				case 204:
					return "redirect:/admin";
				default:
					return "redirect:/";
				}
			}
	   }
	   return "redirect:/";
   }
}
