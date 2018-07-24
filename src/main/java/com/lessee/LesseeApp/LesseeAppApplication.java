package com.lessee.LesseeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Nikhil.Tirmanwar
 *
 */
@SpringBootApplication(scanBasePackages="com.lessee")
@EnableAspectJAutoProxy
@EnableMongoRepositories(basePackages = "com.lessee")
public class LesseeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LesseeAppApplication.class, args);
	}
}
