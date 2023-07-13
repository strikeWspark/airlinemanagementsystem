package com.dryfire.airlinemanagementsystem.service;

import com.dryfire.airlinemanagementsystem.model.Flight;
import com.dryfire.airlinemanagementsystem.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AirlineServiceImpl implements AirlineService{
    @Autowired
    private AirlineRepository airlineRepository;
    public  static List<Flight> dummyData = new ArrayList<>();
     static {
        dummyData.add(new Flight(1,"18:10:00","20:00:00","Delhi","Hyderabad",743));
        dummyData.add(new Flight(2,"13:10:00","14:50:00","Pune","Chennai",6435));
        dummyData.add(new Flight(3,"09:30:00","11:30:00","Varanasi","Mumbai",7865));

    }


    @Override
    public List<Flight> getFlight() {
        return (List<Flight>) airlineRepository.findAll();
    }

    @Override
    public Optional<Flight> getFlightDetails(int flightNo) {
        return airlineRepository.findById(flightNo);
    }

    @Override
    public String add(Flight flight) {
         System.out.print(flight.toString());
         airlineRepository.saveAll(dummyData);
         airlineRepository.save(flight);
        return "Success";
    }



}
