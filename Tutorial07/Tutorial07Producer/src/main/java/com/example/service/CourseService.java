package com.example.service;

import java.util.List;

import com.example.model.StudentModel;
import com.example.model.CourseModel;

public interface CourseService
{    
    CourseModel selectCourse(String id_course);
    List<CourseModel> viewCourses();
}
