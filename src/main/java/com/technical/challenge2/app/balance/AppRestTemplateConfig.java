package com.technical.challenge2.app.balance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppRestTemplateConfig {

	@Bean("saldoRest")
	public RestTemplate registroRestTemplate() {
		return new RestTemplate(); 
	}
	
	
}
