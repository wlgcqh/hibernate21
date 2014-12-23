package com.qiheng.hibernate;

import java.sql.Timestamp;
import java.util.Set;

public class Student {

	private String id;

	private String student_name;

	private Set<Student_Course> student_courses;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Set<Student_Course> getStudent_courses() {
		return student_courses;
	}

	public void setStudent_courses(Set<Student_Course> student_courses) {
		this.student_courses = student_courses;
	}

	

	

}
