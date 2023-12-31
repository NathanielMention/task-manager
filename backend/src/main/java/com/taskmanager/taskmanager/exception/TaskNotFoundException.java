package com.taskmanager.taskmanager.exception;

public class TaskNotFoundException extends RuntimeException {
    private Long id;

    public TaskNotFoundException(Long id) {
        super();
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}