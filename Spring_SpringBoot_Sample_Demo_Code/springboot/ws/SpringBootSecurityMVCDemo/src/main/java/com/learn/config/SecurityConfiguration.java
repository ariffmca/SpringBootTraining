package com.learn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
								throws Exception{
		
		auth.inMemoryAuthentication()
		.withUser("ariff").password("{noop}admin").roles("ADMIN").and()
		.withUser("irfana").password("{noop}user").roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity)
			throws Exception{
		
		httpSecurity
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/rest/hello").access("hasRole('USER')")
		.and()
		.httpBasic();
		httpSecurity.csrf().disable();
	}
	
	/*
	 * @Bean
	 * 
	 */
}
