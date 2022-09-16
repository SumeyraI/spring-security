package com.spring.securityExample.spring.security.Example.config;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SpringBootConfiguration  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().antMatchers("/getDashBoard").authenticated()
                .and()
                .authorizeHttpRequests().antMatchers("/getIndex").permitAll();

    }
}
