package com.example.department.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
	
	@Query(value="select * from department", nativeQuery = true)
	ArrayList<Department> getAllDeatils();

}
