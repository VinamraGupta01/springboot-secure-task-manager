package com.springboot_secure_task_manager.repository;

import com.springboot_secure_task_manager.entity.TaskEntity;
import com.springboot_secure_task_manager.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

    List<TaskEntity> findByUser(UserEntity user);
}
