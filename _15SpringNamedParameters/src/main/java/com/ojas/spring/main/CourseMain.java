package com.ojas.spring.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.spring.Dao.CourseDaoImpl;
import com.ojas.spring.config.CourseConfigurationFile;
import com.ojas.spring.model.Course;

public class CourseMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfigurationFile.class);

		CourseDaoImpl csdmpl = context.getBean(CourseDaoImpl.class);
		Course cs = new Course();
		cs.setCourseId(2);
		cs.setCourseName("MNG");
		cs.setCoursePrice("2000");
		cs.setCourseDuration("6months");
		boolean b = csdmpl.CreateCourse(cs);
		System.out.println(b);
	}
}
