package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseModel;
import com.example.model.StudentModel;
import com.example.service.CourseService;
import com.example.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {
	@Autowired
	CourseService courseService;
	
    @RequestMapping("/course/view/{id_course}")
    public CourseModel viewCourse(@PathVariable(value = "id_course") String id_course) {
    	CourseModel course = courseService.selectCourse(id_course);
        return course;
    }
    
    @RequestMapping("/course/viewAll")
    public List<CourseModel> viewAllCourse() {
    	List<CourseModel> courses = courseService.viewCourses();
    	return courses;
    }
}
