package com.springboot_secure_task_manager.controller;

import com.springboot_secure_task_manager.entity.TaskEntity;
import com.springboot_secure_task_manager.entity.UserEntity;
import com.springboot_secure_task_manager.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // CREATE TASK
    @PostMapping
    public ResponseEntity<TaskEntity> createTask(
            @RequestParam String title,
            @RequestParam(required = false) String description,
            Authentication authentication
    ) {
        UserEntity user = (UserEntity) authentication.getPrincipal();

        TaskEntity task = taskService.createTask(title, description, user);
        return ResponseEntity.ok(task);
    }

    // GET ALL TASKS OF LOGGED-IN USER
    @GetMapping
    public ResponseEntity<List<TaskEntity>> getMyTasks(
            Authentication authentication
    ) {
        UserEntity user = (UserEntity) authentication.getPrincipal();
        return ResponseEntity.ok(taskService.getUserTasks(user));
    }

    // DELETE TASK
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(
            @PathVariable Long id,
            Authentication authentication
    ) {
        UserEntity user = (UserEntity) authentication.getPrincipal();
        taskService.deleteTask(id, user);
        return ResponseEntity.ok("Task deleted successfully");
    }
}
