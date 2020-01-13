package com.crud.kanban_app.mapper;

import com.crud.kanban_app.domain.Task;
import com.crud.kanban_app.domain.TaskDto;
import sun.text.resources.sk.JavaTimeSupplementary_sk;

import java.util.List;


public class TaskMapper {
    public Task mapToTask(final TaskDto taskDto) {
        return new Task(
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getContent());
    }

    public TaskDto mapToTaskDto(final Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getContent());
    }

    public List<TaskDto> mapToTaskDtoList(final List<Task> taskList) {}
}
