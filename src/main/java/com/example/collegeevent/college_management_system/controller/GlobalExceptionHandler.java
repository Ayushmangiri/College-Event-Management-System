package com.example.collegeevent.college_management_system.controller;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)


    public ResponseEntity<Object> handleValidException(MethodArgumentNotValidException ex){
        List<String> errors = new ArrayList<>();
        for(FieldError error : ex.getBindingResult().getFieldErrors()){
            errors.add(error.getField()+":"+error.getDefaultMessage());
        }
        return  new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
