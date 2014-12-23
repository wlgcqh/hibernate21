package com.qiheng.hibernate;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Test1 {
	public static SessionFactory sessionFactory;

	static {
		try {
			Configuration cfg = new Configuration().configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).buildServiceRegistry();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		Student_Course student_Course1 = new Student_Course();
		Student_Course student_Course2 = new Student_Course();
		student_Course1.setTimestamp(new Timestamp(new Date().getTime()));
		
		student_Course2.setTimestamp(new Timestamp(new Date().getTime()));
		Set<Student_Course> set = new HashSet<Student_Course>();
		set.add(student_Course1);
		set.add(student_Course2);
		
		
		Student student1 = new Student();
		student1.setStudent_name("qiheng");
		student1.setStudent_courses(set);
		
		Student student2 = new Student();
		student2.setStudent_name("zhangsan");
		student2.setStudent_courses(set);
		
		Course course1 = new Course();
		course1.setCourse_name("math");
		course1.setStudent_courses(set);
		
		student_Course1.setCourse(course1);
		student_Course1.setStudent(student1);
		student_Course2.setStudent(student2);
		
		
		try{
			tx = session.beginTransaction();
			session.save(student1);
			session.save(course1);
			
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		
		
		}finally{
			session.close();
		}
		
	}
}

