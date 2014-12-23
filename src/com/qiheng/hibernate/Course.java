package com.qiheng.hibernate;

import java.util.Set;

public class Course {

	private String id;

	private String course_name;

	private int credit;

	private Set<Student_Course> student_courses;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Set<Student_Course> getStudent_courses() {
		return student_courses;
	}

	public void setStudent_courses(Set<Student_Course> student_courses) {
		this.student_courses = student_courses;
	}

}
