package com.crud.kanban_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class KanbanApplication {
// required for external Tomcat only
// public class KanbanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(KanbanApplication.class, args);
	}

//	required for external Tomcat only
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(KanbanApplication.class);
//	}

}
