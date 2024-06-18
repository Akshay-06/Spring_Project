package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Department;

@Controller
public class HomeController {
	
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Department One");
		
	}
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		
		int num3 = i+j;
		m.addAttribute("num3", num3);
		
		return "result";
		
	}
	
	
	// We can use ModelAttribute or we can use just Department as parameter
	
	@RequestMapping("addDepartment")
	public String add(@ModelAttribute Department dept) {
		
		return "result1";
		
	}
	
}
