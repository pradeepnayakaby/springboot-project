package com.example.department.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService{

	
	@Autowired
	DepartmentRepository dr;
	@Override
	public String createDepartment(Department d) {
		dr.save(d);
		return "created";
	}
	@Override
	public ArrayList<Department> viewAllDeatils() {
		
		return dr.getAllDeatils();
	}

}
