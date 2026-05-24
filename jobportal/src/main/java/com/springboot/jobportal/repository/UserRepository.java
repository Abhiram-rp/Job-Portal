package com.springboot.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jobportal.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
