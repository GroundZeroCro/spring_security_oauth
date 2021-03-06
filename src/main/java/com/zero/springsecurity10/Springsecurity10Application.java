package com.zero.springsecurity10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Springsecurity10Application {

  public static void main(String[] args) {
    SpringApplication.run(Springsecurity10Application.class, args);
  }

}
