package com.mycompany.boot.factory;

import com.mycompany.boot.dto.ApiResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ApiResponseFactoryTest {

    private ApiResponseFactory instance = new ApiResponseFactory();

    @Test
    public void shouldWrapSuccess(){
        ApiResponse<String> result = instance.wrapSuccessResponse("test");
        assertThat(result.getData() , is("test"));
        assertThat(result.getStatus() , is("success"));
    }

    @Test
    public void shouldWrapFail(){
        ApiResponse<String> result = instance.wrapFailureResponse("testbad");
        assertThat(result.getData() , is("testbad"));
        assertThat(result.getStatus() , is("failure"));
    }

}