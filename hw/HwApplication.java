package com.injection.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HwApplication.class, args);
			American a1 = context.getBean(American.class);
			Asian b1 = context.getBean(Asian.class);
			Cars cars = context.getBean(Cars.class);
			a1.setMake("Tesla");
			a1.setModel("X");
			b1.setMake("Nissan");
			b1.setModel("Skyline");
			cars.setYear(2022);
			cars.setColor("Black");
			cars.setCost(500000);
			
			
			
			a1.toString();
			System.out.println(a1.toString());
			b1.toString();
			System.out.println(b1.toString());
			//cars.toString();
			//System.out.println(cars.toString());
			

	}

}
