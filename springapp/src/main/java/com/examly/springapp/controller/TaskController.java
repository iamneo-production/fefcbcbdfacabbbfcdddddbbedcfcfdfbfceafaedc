package com.examly.springapp.controller;

import com.examly.springapp.entity.Task;
import com.examly.springapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/saveTask")
    @ResponseStatus(HttpStatus.CREATED)
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/getTask")
    public Task getTask(@RequestParam Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @GetMapping("/deleteTask")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@RequestParam Long taskId) {
        taskService.deleteTask(taskId);
    }
}
