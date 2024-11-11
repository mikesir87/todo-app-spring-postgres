package com.atomicjar.todos;

import com.atomicjar.todos.entity.Todo;
import com.atomicjar.todos.repository.TodoRepository;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.testcontainers.DockerClientFactory;

import java.sql.PreparedStatement;

public class TestApplication {
    public static void main(String[] args) {
        SpringApplication
                .from(Application::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
