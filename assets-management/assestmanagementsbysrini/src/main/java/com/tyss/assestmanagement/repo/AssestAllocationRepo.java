package com.tyss.assestmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assestmanagement.dto.AssestAllocation;

public interface AssestAllocationRepo extends JpaRepository<AssestAllocation, Integer> {

}
