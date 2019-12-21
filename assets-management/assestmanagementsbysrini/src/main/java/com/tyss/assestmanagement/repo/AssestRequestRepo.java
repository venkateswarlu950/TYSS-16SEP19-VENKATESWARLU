package com.tyss.assestmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assestmanagement.dto.AssestRequest;

public interface AssestRequestRepo extends JpaRepository<AssestRequest, Integer>{

}
