package com.praveen.spring.core.di.lookupmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 @Bean 
 public TokenMachine tokenMachine(){
  return new TokenMachine(){

   @Override
   public Token generateToken() {
    return new Token();
   }
   
  };
 }
}
