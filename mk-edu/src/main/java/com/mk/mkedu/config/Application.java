package com.mk.mkedu.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mk.mkedu.*")
@EntityScan(basePackages = "com.mk.mkedu.*")
@ComponentScan(basePackages = { "com.mk.mkedu.*" })

public class Application
{
	private static final Logger logger = LogManager.getLogger(Application.class);
    public static void main(String[] args) throws Throwable
    {
        SpringApplication.run(Application.class, args);
        logger.info("application class is done server is going to up");
    }
}