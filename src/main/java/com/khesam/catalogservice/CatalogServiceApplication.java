package com.khesam.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *The @SpringBootApplication annotation is a shortcut that includes three different annotations:
 * 1. @Configuration marks the class as a source of beans definitions
 * 2. @ComponentScan enables component scanning to find and register beans in the Spring context automatically.
 * 3. @EnableAutoConfiguration enables the autoconfiguration capabilities offered by Spring Boot.
 * <p>
 * Spring Boot autoconfiguration is triggered by several conditions,
 * such as the presence of certain classes in the classpath,
 * the existence of specific beans, or the values of some properties.
 * For example if a project depends on spring-boot-starter-web,
 * Spring Boot will initialize an embedded Tomcat server instance and apply
 * the minimal configuration required to get a web application up and running
 */
@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

}
