package com.dryfire.airlinemanagementsystem.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FlightAdvice {

    @ResponseBody
    @ExceptionHandler(FlightException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String flightNotFoundHandler(FlightException ex){
        return ex.getMessage();
    }
}
