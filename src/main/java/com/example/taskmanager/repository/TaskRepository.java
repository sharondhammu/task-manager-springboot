package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taskmanager.model.User;
import java.util.List;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findByUser(User user);
}
