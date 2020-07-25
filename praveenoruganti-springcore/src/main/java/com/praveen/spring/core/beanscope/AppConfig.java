package com.praveen.spring.core.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "token")
	@Scope(scopeName = "prototype")
	public Token getToken() {
		return new Token();
	}

	@Bean(name = "tokenMachine")
	@Scope(scopeName = "singleton")
	public TokenMachine getTokenMachine() {
		return new TokenMachine();
	}

}
