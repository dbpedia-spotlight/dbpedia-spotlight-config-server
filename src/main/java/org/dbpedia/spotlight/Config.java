package org.dbpedia.spotlight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@SuppressWarnings("checkstyle:hideutilityclassConstructor")
public class Config {
    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
