package com.spring.securityExample.spring.security.Example.config;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SpringBootConfiguration  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeHttpRequests()
                .antMatchers("/getDashBoard").hasRole("Admin")
                .and()
                .authorizeHttpRequests().antMatchers("/getIndex").permitAll();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Admin").password("{noop}password").roles("Admin","User")
                .and()
                .withUser("User").password("{noop}password").roles("User");
    }
}
