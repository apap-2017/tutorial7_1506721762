package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.StudentDAO;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import groovy.util.logging.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		
		return studentDAO.selectStudent(npm);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentDAO.selectAllStudents();
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentModel model) {
		// TODO Auto-generated method stub
		
	}
	


}
