package com.web.spring.springapp;

import com.web.spring.springapp.controller.MainController;
import com.web.spring.springapp.service.MainService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackageClasses = {MainService.class, MainController.class})
public class SpringAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
