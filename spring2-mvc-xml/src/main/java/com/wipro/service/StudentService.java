package com.wipro.service;

import com.wipro.common.domain.Student;

public interface StudentService {
	public void addStudent(Student student);

	public Student getStudent(int studentid);
}
