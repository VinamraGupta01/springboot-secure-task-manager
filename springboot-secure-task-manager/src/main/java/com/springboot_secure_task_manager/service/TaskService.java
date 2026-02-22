package com.springboot_secure_task_manager.service;

import com.springboot_secure_task_manager.entity.TaskEntity;
import com.springboot_secure_task_manager.entity.UserEntity;

import java.util.List;

public interface TaskService {

    TaskEntity createTask(
            String title,
            String description,
            UserEntity user
    );

    List<TaskEntity> getUserTasks(UserEntity user);

    void deleteTask(Long taskId, UserEntity user);
}
