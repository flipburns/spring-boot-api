package com.mycompany.boot.dto;

import org.springframework.hateoas.ResourceSupport;

/**
 * This response class will be returned by all APIs. It is a standard response which wraps a generic type
 * so we can wrap any other response object and enrich it with standard elements such as success status, links, errors
 * etc. Decorating/wrapping is preferred over extending so we can avoid mass inheritance. (favour composition over inheritance)
 *
 * @param <T> generic type which represents the response type that this object wraps
 */
public class ApiResponse<T> extends ResourceSupport {

    private String status;

    private T data;

    public ApiResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
