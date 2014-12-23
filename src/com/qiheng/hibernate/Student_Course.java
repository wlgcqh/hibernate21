package com.qiheng.hibernate;

import java.sql.Timestamp;
import java.util.Set;

public class Student_Course {
	private String id;
	
	private Timestamp timestamp;
	
	private Student student;
	
	private Course course;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	
	
}
