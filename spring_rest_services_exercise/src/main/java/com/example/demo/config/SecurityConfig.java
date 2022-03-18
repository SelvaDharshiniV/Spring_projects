package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
public class SecurityConfig{
	
}
//@Configuration
//@EnableGlobalMethodSecurity(jsr250Enabled = true)//common annotation ..can use in all java framework
//public class SecurityConfig extends WebSecurityConfigurerAdapter*/ {
//
//	@Autowired
//	BCryptPasswordEncoder encoder;
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("india").password(encoder.encode("india")).roles("ADMIN")
//			.and()
//			.withUser("nepal").password(encoder.encode("nepal")).roles("GUEST");
//
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
////		http.authorizeHttpRequests()
////			.antMatchers("/api/v1/loans/**").hasRole("ADMIN")
////			.and()
////			.httpBasic();
//		http.authorizeHttpRequests()
//		.antMatchers("/api/v1/loans/**")
//		.authenticated()
//		.and()
//		.httpBasic();
//	}
////	BasicAuthenticationFilter bas;
//}
