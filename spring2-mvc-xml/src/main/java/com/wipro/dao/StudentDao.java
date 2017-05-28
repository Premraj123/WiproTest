package com.wipro.dao;

import com.wipro.common.domain.Student;

public interface StudentDao {
	public void addStudent(Student student);

	public Student getEmployee(int studentid);

}
