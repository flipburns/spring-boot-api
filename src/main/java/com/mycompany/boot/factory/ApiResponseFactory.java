package com.mycompany.boot.factory;


import com.mycompany.boot.dto.ApiResponse;

public class ApiResponseFactory {


    public <T> ApiResponse<T> wrapSuccessResponse(T apiResponse) {
        return new ApiResponse("success",apiResponse);
    }

    public <T> ApiResponse<T> wrapFailureResponse(T apiResponse) {
        return new ApiResponse("failure",apiResponse);
    }
}
