package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CourseModel selectCourse(String id_course) {
		// TODO Auto-generated method stub
		log.info("Tes");
		log.info(id_course + ": id course");
		CourseModel course = restTemplate.getForObject("http://localhost:8080/rest/course/view/" + id_course, CourseModel.class);
		return course;
	}
	
}
