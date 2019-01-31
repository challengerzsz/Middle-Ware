package com.xiyou3g.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author zeng on 18-10-19.
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.xiyou3g")
@EnableJpaRepositories(basePackages = "com.xiyou3g")
@EntityScan(basePackages = "com.xiyou3g")
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
