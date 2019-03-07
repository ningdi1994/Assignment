package com.antra.assignment.userproject.controllerAdvice;


import com.antra.assignment.userproject.Exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity globalHandler(){

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity CustomHandler(CustomException ex){

        return new ResponseEntity(ex.getMessage(),HttpStatus.NOT_ACCEPTABLE);
    }
}
