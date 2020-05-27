package com.springbootcloud.gcpkuberneteshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcpKubernetesHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpKubernetesHelloApplication.class, args);
	}
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello "+name;
	}

}
