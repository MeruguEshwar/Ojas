package com.ojas._02SpringMVCAndHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ojas._02SpringMVCAndHibernate.model.Student;
import com.ojas._02SpringMVCAndHibernate.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public ModelAndView load(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return new ModelAndView("Student");
	}

	@RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	public ModelAndView inserstudent(@ModelAttribute Student student) {
		ModelAndView mv = new ModelAndView();
		System.out.println(student);
		int i = service.createStudent(student);
		if (i != 0) {
			mv.addObject("msg", "student inserted sussfully");
			mv.setViewName("Student");
		} else {
			mv.addObject("msg", "failed");
			mv.setViewName("Student");
		}
		return mv;
	}

	@RequestMapping(value = "/list")
	public ModelAndView list() {
		List<Student> std = service.viewAllStudent();
		ModelAndView mv = new ModelAndView();
		mv.addObject("students", std);
		mv.setViewName("view");
		return mv;
	}

	@RequestMapping(value = "/edit")
	public String editStudent(@RequestParam("id") int studentId, Model model) {
		Student student = service.editStudent(studentId);
		model.addAttribute("student", student);
		return "update";
	}

	@RequestMapping(value = "/delete")
	public String deleteStudent(@RequestParam("id") int studentId) {
		service.deleteStudent(studentId);
		return "redirect:/list";
	}

}
