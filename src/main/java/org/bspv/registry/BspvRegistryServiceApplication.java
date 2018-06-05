package org.bspv.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BspvRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BspvRegistryServiceApplication.class, args);
	}
}
