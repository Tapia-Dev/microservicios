package com.microservicio.usuario.book.exceptions.controller;

import com.microservicio.usuario.book.exceptions.ResourceNotFound;
import com.microservicio.usuario.book.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {


    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ApiResponse>handlerResourseNotFoundException(ResourceNotFound resourceNotFound){
        String mensaje = resourceNotFound.getMessage();

        ApiResponse response = new ApiResponse().builder()
                .mensaje(mensaje)
                .sucess(true)
                .status(HttpStatus.NOT_FOUND)
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
