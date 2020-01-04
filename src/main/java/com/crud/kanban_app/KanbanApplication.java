package com.crud.kanban_app;

import com.crud.kanban_app.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KanbanApplication {

	public static void main(String[] args) {
		TaskDto taskDto = new TaskDto(
				(long)1,
				"Test of Lombok",
				"First use of Lombok");

		Long id = taskDto.getId();
		String  title = taskDto.getTitle();
		String content = taskDto.getContent();

		System.out.println(id + " " + title + " " + content);

		SpringApplication.run(KanbanApplication.class, args);
	}

}
