package com.springboot.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jobportal.model.Application;
import com.springboot.jobportal.model.Job;
import com.springboot.jobportal.model.User;
import com.springboot.jobportal.repository.ApplicationRepository;
import com.springboot.jobportal.repository.JobRepository;
import com.springboot.jobportal.repository.UserRepository;

@Service
public class ApplicationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application applyForJob(Long userId, Long jobId) {
        User user = userRepository.findById(userId)
                                    .orElseThrow(() -> new RuntimeException("User not found"));

        Job job = jobRepository.findById(jobId)
                                .orElseThrow(() -> new RuntimeException("Job not found"));

        Application application = new Application(user, job);

        return applicationRepository.save(application);
    }

}
