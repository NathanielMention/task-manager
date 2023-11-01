package com.taskmanager.taskmanager.models;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    // You can define a relationship to a user here
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Task() {
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters and Setters for relationships
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
