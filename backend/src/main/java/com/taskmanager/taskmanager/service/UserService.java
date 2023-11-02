package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.exception.UserNotFoundException;
import com.taskmanager.taskmanager.models.User;
import com.taskmanager.taskmanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        updatedUser.setId(id);
        return userRepository.save(updatedUser);
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
