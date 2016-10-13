package com.sims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("faculty")
public class FacultyController {

	   @RequestMapping(method = RequestMethod.GET)
	   public String welcomePage(ModelMap model) {
	      return "facultyHome";
	   }
}
