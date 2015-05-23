package com.mycompany.boot.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("factory-configuration")
public class PackageConfiguration {

    @Bean
    public ApiResponseFactory apiResponseFactory(){
        return new ApiResponseFactory();
    }

}
