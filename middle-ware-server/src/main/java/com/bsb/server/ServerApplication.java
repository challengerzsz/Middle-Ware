package com.bsb.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zeng on 18-10-19.
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.bsb.oauth2", "com.bsb.websocket"})
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
