package com.vaishnavi.cab.booking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableEurekaServer
public class CabAppApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CabAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CabAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length == 0) {
            logger.info("No arguments provided to CabAppApplication");
        } else {
            for (String arg : args) {
                logger.info("Startup argument: {}", arg);
            }
        }
    }
}
