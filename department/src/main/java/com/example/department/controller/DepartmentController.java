package com.example.department.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;


@Controller
public class DepartmentController {

	@GetMapping(value="/createDepartment")
	public String mapCreateDepartment() {
		return "createDepartment";
		
	}
	
	@GetMapping(value="/viewInfo")
	public String mapViewDepartment() {
		return "viewInfo";
		
	}
	
	@Autowired
	DepartmentService ds;
	
	@PostMapping(value="/createDepartment")
	public String createDepartment(@RequestParam("dept_id") String dept_id,@RequestParam("dept_name") String dept_name) {
		
		Department d = new Department(dept_id,dept_name);
	String msg=	ds.createDepartment(d);
		System.out.println(msg);
		return "createDepartment";
	}
	
	
	@GetMapping(value="/viewDepartment")
	public String viewDepartment(Model model) {
	ArrayList<Department> d=	ds.viewAllDeatils();
	model.addAttribute("Department", d);
		
		return "showInfo";
	}
	
	
}
