package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService
{
    @Autowired
    private StudentMapper studentMapper;

	@Override
	public CourseModel selectCourse(String id_course) {
		// TODO Auto-generated method stub
		log.info ("select student with id_course {}", id_course);
		return studentMapper.selectCourse(id_course);
	}

	@Override
	public List<CourseModel> viewCourses() {
		// TODO Auto-generated method stub
		return studentMapper.viewCourses();
	}

}
