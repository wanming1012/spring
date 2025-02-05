package com.example.configurationclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class ConfigurationclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationclientApplication.class, args);
	}

}

@RefreshScope
@RestController
class MessageRestController {
	@Value("${message:Hello default}")
	private String message;

	@RequestMapping("/message")
	public String getMessage() {
		return this.message;
	}
	
}