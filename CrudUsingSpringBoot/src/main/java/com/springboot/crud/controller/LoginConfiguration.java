package com.springboot.crud.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class LoginConfiguration extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		auth.inMemoryAuthentication()
		.withUser("sanjeet")
		.password("sanjeet")
		.roles("user")
		.and()
		.withUser("ram")
		.password("ram")
		.roles("admin");
	}
   @Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
		
	

}
