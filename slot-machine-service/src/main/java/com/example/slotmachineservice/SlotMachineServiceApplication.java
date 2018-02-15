package com.example.slotmachineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SlotMachineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlotMachineServiceApplication.class, args);
	}
}
