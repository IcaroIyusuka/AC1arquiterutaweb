package me.icaro.AC1.service;

import me.icaro.AC1.modelo.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task createTask(Task task);
}
