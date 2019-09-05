package be.axxes.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class CustomWebSecurityAdapter {

//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth)
//            throws Exception {
//
//        auth.inMemoryAuthentication()
//            .passwordEncoder(NoOpPasswordEncoder.getInstance())
//            .withUser("admin").password("admin").roles("ADMIN")
//            .and()
//            .withUser("user").password("user").roles("USER");
//    }

    //    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        // configure
    }
}
