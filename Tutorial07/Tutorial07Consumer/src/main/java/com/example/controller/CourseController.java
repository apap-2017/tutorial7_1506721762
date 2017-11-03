package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.CourseModel;
import com.example.service.CourseService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class CourseController {
	@Autowired 
	CourseService courseDAO;
	
	 @RequestMapping("/course/view/{id_course}")
	 public String viewCourse(Model model, @PathVariable(value = "id_course") String id_course) {	  	
		CourseModel course = courseDAO.selectCourse(id_course);
	  	model.addAttribute("title", "View Course");
	    model.addAttribute ("course", course);
	    return "view-course";   
	  }
  
}
