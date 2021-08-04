package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Hashem Rashed
 */
@SpringBootApplication
@EnableSwagger2
public class BestHotelProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestHotelProviderApplication.class, args);
	}

}
