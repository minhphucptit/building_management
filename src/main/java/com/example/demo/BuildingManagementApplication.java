package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EntityScan(basePackages = {"com.nminh.models"})
@EnableJpaRepositories( {"com.nminh.services"})
@ComponentScan(basePackages = {"com.nminh.controllers","com.nminh.models","com.nminh.services"})
public class BuildingManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildingManagementApplication.class, args);
    }

}
