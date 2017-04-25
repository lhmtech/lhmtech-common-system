package com.lhmtech.common.system

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.lhmtech.common.system"] )
class AcceptanceApplication {

	//this is for test
	static void main(String[] args) {
		SpringApplication.run AcceptanceApplication, args
	}
}
