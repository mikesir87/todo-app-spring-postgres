package com.atomicjar.todos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class ContainersConfig {

    @Bean
    @ServiceConnection
    @RestartScope
    PostgreSQLContainer<?> postgreSQLContainer(@Value("${docker.image.postgres}") String postgresImage) {
        return new PostgreSQLContainer<>(
                DockerImageName.parse(postgresImage).asCompatibleSubstituteFor("postgres")
        );
    }

}
