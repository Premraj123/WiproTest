package com.wipro.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.common.domain.Student;
import com.wipro.dao.StudentDao;
import com.wipro.service.StudentService;



@Service("employeeService")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public Student getStudent(int studentid) {
		return studentDao.getEmployee(studentid);
	}

}
