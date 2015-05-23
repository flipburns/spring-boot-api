package com.mycompany.boot.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("service-configuration")
public class PackageConfiguration {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
