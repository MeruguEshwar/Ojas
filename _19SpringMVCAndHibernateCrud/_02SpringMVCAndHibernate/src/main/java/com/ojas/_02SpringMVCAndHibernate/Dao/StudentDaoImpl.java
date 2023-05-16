package com.ojas._02SpringMVCAndHibernate.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ojas._02SpringMVCAndHibernate.model.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;

	@Override
	public int createStudent(Student student) {

		System.out.println(student);

		int i = (int) hibernatetemplate.save(student);
		return i;
	}

	@Override
	public List<Student> viewAllStudent() {
//		List<Student> li = new ArrayList<Student>();
//		for(Student s:li) {
//			System.out.println("StudentDAoImpl list is:"+s);
//		}
		return hibernatetemplate.loadAll(Student.class);
	}

	@Override
	public void deleteStudent(int studentId) {
		hibernatetemplate.delete(studentId);
	}

	@Override
	public void updateStudent(Student student) {
		hibernatetemplate.update(student);
	}

	@Override
	public Student editStudent(int studentId) {
		return hibernatetemplate.get(Student.class,studentId);
	}

}
