package com.taskmanager.taskmanager.repository;

import com.taskmanager.taskmanager.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
