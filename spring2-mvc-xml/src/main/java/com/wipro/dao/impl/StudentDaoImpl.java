package com.wipro.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.common.domain.Student;
import com.wipro.dao.StudentDao;



@Repository("employeeDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);

	}

	@Override
	public Student getEmployee(int studentid) {
		return sessionFactory.getCurrentSession().get(Student.class, studentid);
	}
}
