//package com.lopez.rafael.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	UserDetailsServiceImpl userDetailsServiceImpl;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder());
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/", "/login").permitAll()
//		.antMatchers("/home").authenticated()
//		.and().csrf().disable()
//		.formLogin().loginPage("/login")
//		.defaultSuccessUrl("/home")
//		.usernameParameter("username")
//		.passwordParameter("password")
//		.and().exceptionHandling().accessDeniedPage("/access-denied")
//		.and()
//		.logout().logoutUrl("/logout").logoutSuccessUrl("/login");
//	}
//
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//}
