package com.application.applicaion;

import org.springframework.boot.SpringApplication;

public class TestApplicaionApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApplicaionApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
