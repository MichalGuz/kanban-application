package com.crud.kanban_app.controller;

import com.crud.kanban_app.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test1/task")
public class TaskController {
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    public TaskDto getTask(long id) {
        return new TaskDto(1L, "Test title", "Test content.");
    }

    public void deleteTask(long taskId) {}

    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L, "Updated task", "Test content after update.");
    }

    public void createTask( TaskDto taskDto) {};
}
