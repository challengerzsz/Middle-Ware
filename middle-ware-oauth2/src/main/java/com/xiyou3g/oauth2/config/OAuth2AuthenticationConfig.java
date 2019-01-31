package com.xiyou3g.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author zeng on 18-10-19.
 * @version 1.0
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthenticationConfig extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        clients
                .inMemory()
                .withClient("xiyou3g")
                .secret("xiyou3g")
                .authorizedGrantTypes("authorization_code")
                .redirectUris("http://localhost:8060/callBack/test")
                .scopes("app");
    }

}
