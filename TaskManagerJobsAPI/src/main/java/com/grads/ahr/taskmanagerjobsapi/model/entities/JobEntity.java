package com.grads.ahr.taskmanagerjobsapi.model.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Jobs")
public class JobEntity {

    private String taskName;
    private String description;
    private int priority;
    private Date completedBy;
    private Boolean isCompleted;

    public JobEntity(String taskName, String description, int priority, Date completedBy, Boolean isCompleted) {
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        this.completedBy = completedBy;
        this.isCompleted = isCompleted;
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
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", completedBy=" + completedBy +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
