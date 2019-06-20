package com.crowd.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.crowd", "com.crowd.entities"})
@EnableJpaRepositories(basePackages = "com.crowd.repository")
@EntityScan(basePackages = "com.crowd.entities")
public class CrowdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrowdApplication.class, args);
    }

}
