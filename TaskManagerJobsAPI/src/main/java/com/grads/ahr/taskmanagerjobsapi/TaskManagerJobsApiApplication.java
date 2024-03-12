package com.grads.ahr.taskmanagerjobsapi;

import com.grads.ahr.taskmanagerjobsapi.model.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TaskManagerJobsApiApplication {

    @Autowired
    private JobRepository jobRepository;

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerJobsApiApplication.class, args);
        System.out.println("Hello World");
    }

}
