package org.example.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.project.mapper")
public class ProjectStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectStartApplication.class, args);
    }
}
