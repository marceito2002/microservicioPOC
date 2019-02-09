package com.buongiorno.cat.microservices.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;       
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApp.class, args);
	}

}

