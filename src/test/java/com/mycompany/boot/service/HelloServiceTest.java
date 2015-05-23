package com.mycompany.boot.service;

import com.mycompany.boot.dto.HelloServiceResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HelloServiceTest {

    private HelloService helloService = new HelloService();

    @Test
    public void shouldSayHello(){
        HelloServiceResponse result = helloService.getApiResponse("philip");
        assertThat(result.getGreeting() , is("Hello philip!"));
    }

}