package com.tyss.assestmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assestmanagement.dto.Assest;
import com.tyss.assestmanagement.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer> {

}
