package com.mycompany.boot.service;

import com.mycompany.boot.dto.HelloServiceResponse;
import org.springframework.cache.annotation.Cacheable;

import static org.apache.commons.lang3.StringUtils.*;

/**
 * This represents any service that might be used to generate data in your API. It returns
 */
public class HelloService {

    private static final String GREETING_PREFIX = "Hello ";
    private static final String GREETING_SUFFIX = "!";
    private static final String DEFAULT_USER_NAME = "World";

    @Cacheable("helloCache")
    public HelloServiceResponse getApiResponse(String name){
        return new HelloServiceResponse(GREETING_PREFIX + getNameOrDefault(name) + GREETING_SUFFIX) ;
    }

    private String getNameOrDefault(String name) {
        return isNotBlank(name) ? name : DEFAULT_USER_NAME;
    }


}
