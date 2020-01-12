package com.crud.kanban_app;

import com.crud.kanban_app.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
