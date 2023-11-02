package com.taskmanager.taskmanager.exception;

public class UserNotFoundException extends RuntimeException {
    private Long id;

    public UserNotFoundException(Long id) {
        super();
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
