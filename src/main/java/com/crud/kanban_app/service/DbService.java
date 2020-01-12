package com.crud.kanban_app.service;

import com.crud.kanban_app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {
    @Autowired
    private TaskRepository taskRepository;

}
