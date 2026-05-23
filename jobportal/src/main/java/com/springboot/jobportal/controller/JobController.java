package com.springboot.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jobportal.model.Job;
import com.springboot.jobportal.service.JobService;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.createJob(job),HttpStatus.OK);
    }

    @PostMapping("/jobs/all")
    public ResponseEntity<List<Job>> getAllJobs(){
        return new ResponseEntity<>(jobService.getAllJobs(),HttpStatus.OK);
    }
}
