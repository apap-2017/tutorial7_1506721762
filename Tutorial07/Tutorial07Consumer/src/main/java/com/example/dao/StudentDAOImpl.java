package com.example.dao;

import java.util.List;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		log.info(npm);		
		StudentModel student = restTemplate.getForObject("http://localhost:8080/rest/student/view/" + npm, StudentModel.class);
		return student;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub	
		List<StudentModel> students = restTemplate.getForObject("http://localhost:8080/rest/student/viewall", List.class);
		return students; 
	}
	
}
