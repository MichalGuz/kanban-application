package com.crud.kanban_app.service;

import com.crud.kanban_app.domain.Task;
import com.crud.kanban_app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(final Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task saveTask(final Task task){
        return taskRepository.save(task);
    }

    public Optional<Task> getTask(final Long id) {
        return taskRepository.findById(id);
    }

    public void deleteTask(final Long id) {
        taskRepository.deleteById(id);
    }
}
