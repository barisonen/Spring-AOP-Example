package com.javatpoint;

import com.javatpoint.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopBeforeAdviceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopBeforeAdviceExampleApplication.class, args);
	}

}
