package me.icaro.AC1.repository;

import me.icaro.AC1.modelo.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
}