package com.dryfire.airlinemanagementsystem.exceptions;


public class FlightException extends RuntimeException{

    public FlightException(Long id){
        super("Flight is not found exception " + id);
    }
}

