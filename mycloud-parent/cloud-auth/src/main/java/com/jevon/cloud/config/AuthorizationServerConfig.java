package com.jevon.cloud.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        /**
         * 配置oauth2服务跨域
         */
//        CorsConfigurationSource source = new CorsConfigurationSource() {
//            @Override
//            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
//                CorsConfiguration corsConfiguration = new CorsConfiguration();
//                corsConfiguration.addAllowedHeader("*");
//                corsConfiguration.addAllowedOrigin(request.getHeader( HttpHeaders.ORIGIN));
//                corsConfiguration.addAllowedMethod("*");
//                corsConfiguration.setAllowCredentials(true);
//                corsConfiguration.setMaxAge(3600L);
//                return corsConfiguration;
//            }
//        };


        security.allowFormAuthenticationForClients();
        security.tokenKeyAccess("permitAll()");
        security.checkTokenAccess("permitAll()");

    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory() // 使用in-memory存储
                .withClient("clientId") // client_id
                .secret(new BCryptPasswordEncoder().encode("clientSecret")).authorizedGrantTypes("password").redirectUris("http://www.baidu.com"); // 允许的授权范围

    }
}
