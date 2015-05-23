package com.mycompany.boot.controller;

import com.mycompany.boot.dto.ApiResponse;
import com.mycompany.boot.dto.HelloServiceResponse;
import com.mycompany.boot.factory.ApiResponseFactory;
import com.mycompany.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private ApiResponseFactory apiResponseFactory;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ApiResponse<HelloServiceResponse> sayHello(@PathVariable String name) {

        //call our hello service, passing in our path variable
        ApiResponse<HelloServiceResponse> response = apiResponseFactory.wrapSuccessResponse(helloService.getApiResponse(name));

        //enrich the response with links
        response.add(new Link("/hello/"+name).withRel("self"));

        return response;
    }

}