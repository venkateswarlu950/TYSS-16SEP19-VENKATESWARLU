package com.tyss.assestmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assestmanagement.dto.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
