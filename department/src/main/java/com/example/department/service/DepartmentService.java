package com.example.department.service;

import java.util.ArrayList;

import com.example.department.entity.Department;

public interface DepartmentService {

	String createDepartment(Department d);

	ArrayList<Department> viewAllDeatils();

}
