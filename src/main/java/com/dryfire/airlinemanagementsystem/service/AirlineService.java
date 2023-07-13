package com.dryfire.airlinemanagementsystem.service;

import com.dryfire.airlinemanagementsystem.model.Flight;

import java.util.List;
import java.util.Optional;

public interface AirlineService {

    public List<Flight> getFlight();
    public Optional<Flight> getFlightDetails(int flightNo);
    public String add(Flight flight);

}
