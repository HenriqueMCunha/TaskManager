package com.grads.ahr.taskmanagerjobsapi.model.repositories;

import com.grads.ahr.taskmanagerjobsapi.model.entities.JobEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepository extends MongoRepository<JobEntity, String> {

}
