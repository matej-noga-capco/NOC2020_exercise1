package com.capco.noc2020.config.security.cookies;

import com.capco.noc2020.config.security.CustomAuthenticationFailureHandler;
import com.capco.noc2020.config.security.CustomAuthenticationSuccessHandler;
import com.capco.noc2020.config.security.CustomLogoutSuccessHandler;
import com.capco.noc2020.config.security.WebSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Profile("cookies")
@EnableSpringHttpSession
public class WebSecurityCookiesConfig extends WebSecurityConfig {

    public WebSecurityCookiesConfig(CustomAuthenticationFailureHandler customAuthenticationFailureHandler, CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler, CustomLogoutSuccessHandler customLogoutSuccessHandler) {
        super(customAuthenticationFailureHandler, customAuthenticationSuccessHandler, customLogoutSuccessHandler);
    }
}
