package com.springboot_secure_task_manager.service;

import com.springboot_secure_task_manager.entity.TaskEntity;
import com.springboot_secure_task_manager.entity.UserEntity;
import com.springboot_secure_task_manager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskEntity createTask(String title, String description, UserEntity user) {

        TaskEntity task = new TaskEntity(
                title,
                description,
                user
        );

        return taskRepository.save(task);
    }

    @Override
    public List<TaskEntity> getUserTasks(UserEntity user) {
        return taskRepository.findByUser(user);
    }

    @Override
    public void deleteTask(Long taskId, UserEntity user) {

        TaskEntity task = taskRepository.findById(taskId)
                .orElseThrow(() ->
                        new IllegalStateException("Task not found")
                );

        if (!task.getUser().getId().equals(user.getId())) {
            throw new IllegalStateException("You cannot delete this task");
        }

        taskRepository.delete(task);
    }
}
