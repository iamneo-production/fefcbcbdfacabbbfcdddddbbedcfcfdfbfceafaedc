package com.examly.springapp.service;

import com.examly.springapp.entity.Task;

import java.util.List;

public interface TaskService {

    Task saveTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long taskId);

    void deleteTask(Long taskId);
}
