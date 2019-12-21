package com.tyss.assestmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.assestmanagement.dto.UserBean;

public interface UserRepo extends JpaRepository<UserBean, Integer> {

}
