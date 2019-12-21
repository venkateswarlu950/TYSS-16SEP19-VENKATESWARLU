package com.tyss.assestmanagement.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.tyss.assestmanagement.dto.Assest;

public interface AssestRepo extends JpaRepository<Assest, Integer> {

	@Transactional
	@Modifying
	@Query("update Assest set assestname=:assestname,assesdesc=:assesdesc,quantity=:quantity,status=:status where assestid=:assestid")
	public void update(@Param("assestname")String assestname,@Param("assesdesc")String assesdesc,@Param("quantity")int quantity,@Param("status")String status,@Param("assestid")int assestid);

	@Query("select  assestid,assestname,assesdesc,quantity from Assest where status=:status")
	public List<Assest> findByString(@Param("status")String status);


}
