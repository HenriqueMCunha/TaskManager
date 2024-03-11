package com.grads.ahr.taskmanagerjobsapi.model.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class JobEntity {

    @Id
    private ObjectId id;
    private ObjectId userId;
    private String taskName;
    private String description;
    private int priority;
    private Date completedBy;
    private Boolean isCompleted;

    public JobEntity(ObjectId id, ObjectId userId, String taskName, String description, int priority, Date completedBy, Boolean isCompleted) {
        this.id = id;
        this.userId = userId;
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        this.completedBy = completedBy;
        this.isCompleted = isCompleted;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCompletedBy() {
        return completedBy;
    }

    public void setCompletedBy(Date completedBy) {
        this.completedBy = completedBy;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "JobEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", completedBy=" + completedBy +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
