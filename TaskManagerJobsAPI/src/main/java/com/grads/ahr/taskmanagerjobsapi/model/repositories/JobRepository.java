package com.grads.ahr.taskmanagerjobsapi.model.repositories;

import com.grads.ahr.taskmanagerjobsapi.model.entities.JobEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface JobRepository extends MongoRepository<JobEntity, String> {

    List<JobEntity> findAllJobs();

    @Query("{'_id' : { $eq : ?0 }}")
    List<JobEntity> findAllById(ObjectId id);

    @Query("{'userId':  { $eq : ?0 }}")
    List<JobEntity> findAllByUserId(ObjectId userId);

    @Query("{'priority': { $eq : ?0 }}")
    List<JobEntity> findJobsByPriority(Integer priority);

    @Query("{'taskName': {'$regex': ?0, '$options': 'i'}}")
    List<JobEntity> findJobsByTaskName(String taskName);

    @Query("{'description': {'$regex': ?0, '$options': 'i'}}")
    List<JobEntity> findJobsByDescription(String description);

    @Query("{'isCompleted':  true}")
    List<JobEntity> findJobsByIsCompleted(boolean completed);

    @Query("{\"completedBy\": {\"$gte\": ISODate(\"start_date\"), \"$lte\": ISODate(\"end_date\")}}")
    List<JobEntity> findJobsCompletedByRange(Date start, Date end);

}
