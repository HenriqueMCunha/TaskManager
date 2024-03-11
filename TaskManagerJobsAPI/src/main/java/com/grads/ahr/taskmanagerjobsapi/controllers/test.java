package com.grads.ahr.taskmanagerjobsapi.controllers;

import com.grads.ahr.taskmanagerjobsapi.model.entities.JobEntity;
import com.grads.ahr.taskmanagerjobsapi.model.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class test {

    private final JobRepository jobRepository;

    @Autowired
    public test(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping("/test")
    public List<JobEntity> testFunction() {
        return jobRepository.findAllJobs();
    }
}
