package com.springboot.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jobportal.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
