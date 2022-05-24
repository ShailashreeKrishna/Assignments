package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration

@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource  dataSource;//used for sql

	
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication()
//		.withUser("india")
//		.password(encoder.encode("Krish"))
//		.roles("ADMIN");
//	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication()
//		.withUser("india")
//		.password(encoder.encode("Krish"))
//		.roles("ADMIN")
//		.and().withUser("nepal").password(encoder.encode("agra")).roles("GUEST");;
//		
		//to get data in sql
		
		String sql="SELECT u.username, a.authority FROM shailu_authorities a, ss_user6 u WHERE u.username =? AND u.username = a.username"; 
				
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select username,password,enabled from ss_user6 where username=?")
		.authoritiesByUsernameQuery(sql).passwordEncoder(encoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub

		http.authorizeHttpRequests()
		.antMatchers("api/v1/**")
		.authenticated()
		.and()
		//.formLogin();
		.httpBasic();
	}

	
}
