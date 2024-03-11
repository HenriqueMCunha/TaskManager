package com.grads.ahr.taskmanagerjobsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TaskManagerJobsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerJobsApiApplication.class, args);
        System.out.println("Hello World");
    }

}
