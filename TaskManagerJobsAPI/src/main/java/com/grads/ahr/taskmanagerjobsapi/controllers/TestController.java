package com.grads.ahr.taskmanagerjobsapi.controllers;

import com.grads.ahr.taskmanagerjobsapi.model.entities.JobEntity;
import com.grads.ahr.taskmanagerjobsapi.model.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    private final JobRepository jobRepository;

    @Autowired
    public TestController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping("/test")
    public void testFunction() {
        ArrayList<JobEntity> allJobs = (ArrayList<JobEntity>) jobRepository.findAll();
        for (JobEntity job : allJobs) {
            System.out.println(job.getTaskName());
        }
    }
}
