package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.StudentRepo;
import com.spring.model.Student;

@Controller
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	@GetMapping("/getStudents")
	public String getStudents(Model m) {
		
		m.addAttribute("students",repo.findAll());
		return "showStudents";
		
	}
	
	
	@GetMapping("/getStudentById")
	public String getStudentById(@RequestParam int sid, Model m) {
		m.addAttribute("students", repo.findById(sid));
		return "showStudents";
	}
	
	
	@GetMapping("/getStudentByName")
	public String getStudentByName(@RequestParam String sname, Model m) {
		m.addAttribute("students", repo.findByName(sname));
		return "showStudents";
	}
	
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("students") Student s) {
		
		
		repo.save(s);
		return "showStudents";
	
	}
	
	
	
	// Delete is not supported by HTML so I used post request
	@PostMapping("deleteStudentById")
	public String deleteStudent(@RequestParam int sid, Model m) {
		
		m.addAttribute("students",repo.findById(sid));
		repo.deleteById(sid);
		return "showStudents";
		
		
	}
	
}
