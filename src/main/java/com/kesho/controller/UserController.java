package com.kesho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class UserController{
 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      //model.addAttribute("message", "Hello Spring MVC Framework!");
      return "welcome";
   }

}
