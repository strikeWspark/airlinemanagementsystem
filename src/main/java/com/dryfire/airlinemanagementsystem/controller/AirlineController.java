package com.dryfire.airlinemanagementsystem.controller;

import com.dryfire.airlinemanagementsystem.exceptions.FlightException;
import com.dryfire.airlinemanagementsystem.model.ExploreUnique;
import com.dryfire.airlinemanagementsystem.model.FindAdventure;
import com.dryfire.airlinemanagementsystem.model.Flight;
import com.dryfire.airlinemanagementsystem.service.AirlineService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @GetMapping("/flight/{id}")
    public Flight msg(@PathVariable int id){
        System.out.println(id);
        return airlineService.getFlightDetails(id)
                .orElseThrow(() -> new FlightException((long) id));
    }

    @GetMapping("all")
    public List<Flight> all(){
        return airlineService.getFlight();
    }

    @GetMapping
    public List<FindAdventure> fun(){
        List<FindAdventure> list = new ArrayList<>();
        list.add(new FindAdventure("https://images.unsplash.com/photo-1483699606544-d42248fceac8?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGNpdHklMjBsaWdodHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        list.add(new FindAdventure("https://images.unsplash.com/photo-1529974019031-b0cd38fd54fc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8Y2l0eSUyMGxpZ2h0fGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        list.add(new FindAdventure("https://images.unsplash.com/photo-1544885935-98dd03b09034?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fHRva3lvfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        list.add(new FindAdventure("https://images.unsplash.com/photo-1554797589-7241bb691973?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8dG9reW98ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        list.add(new FindAdventure("https://images.unsplash.com/photo-1567359485688-f39861174e25?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fG11bWJhaXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));
        list.add(new FindAdventure("https://images.unsplash.com/photo-1567359485688-f39861174e25?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fG11bWJhaXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"));

        return list;
    }

    @GetMapping("/explore-unique")
    public List<ExploreUnique> fun1(){
        List<ExploreUnique> list = new ArrayList<>();
        list.add(new ExploreUnique("https://images.unsplash.com/photo-1551918120-9739cb430c6d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fG1hbGRpdmVzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" ));
        list.add(new ExploreUnique("https://images.unsplash.com/photo-1505881402582-c5bc11054f91?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fG1hbGRpdmVzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" ));
        list.add(new ExploreUnique("https://images.unsplash.com/photo-1543731068-7e0f5beff43a?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWFsZGl2ZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" ));

        return list;
    }

    @PostMapping
    public String add(@RequestBody Flight flight){
        System.out.println(flight.toString());
        return airlineService.add(flight);
    }

    @GetMapping("/api")
    public ResponseEntity<String> ret() {
        RestTemplate restTemplate = new RestTemplate();

        // Set the API endpoint URL
       // String apiUrl = "http://api.aviationstack.com/v1/flights?access_key=baac9a544b8c32c0c3778287a4ae5c47";

        // Make a GET request to the API and get the response
       // ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);

        // Get the status code from the response
     //   int statusCode = response.getStatusCodeValue();

        // Get the response body
      //  String responseBody = response.getBody();

        // Process the API response
    //    System.out.println("Status code: " + statusCode);
    //    System.out.println("Response body: " + responseBody);




/*


        Flight[] flights = {
                {
                        "flight_date": "2023-05-23",
                "flight_status": "active",
                "departure": {
            "airport": "Krabi",
                    "timezone": "Asia/Bangkok",
                    "iata": "KBV",
                    "icao": "VTSG",
                    "terminal": null,
                    "gate": null,
                    "delay": 1,
                    "scheduled": "2023-05-23T16:30:00+00:00",
                    "estimated": "2023-05-23T16:30:00+00:00",
                    "actual": "2023-05-23T16:30:00+00:00",
                    "estimated_runway": "2023-05-23T16:30:00+00:00",
                    "actual_runway": "2023-05-23T16:30:00+00:00"
        },
        "arrival": {
            "airport": "Suvarnabhumi International",
                    "timezone": "Asia/Bangkok",
                    "iata": "BKK",
                    "icao": "VTBS",
                    "terminal": null,
                    "gate": null,
                    "baggage": null,
                    "delay": null,
                    "scheduled": "2023-05-23T17:55:00+00:00",
                    "estimated": "2023-05-23T17:55:00+00:00",
                    "actual": null,
                    "estimated_runway": null,
                    "actual_runway": null
        },
        "airline": {
            "name": "VietJet Air",
                    "iata": "VJ",
                    "icao": "VJC"
        },
        "flight": {
            "number": "343",
                    "iata": "VJ343",
                    "icao": "VJC343",
                    "codeshared": null
        },
        "aircraft": null,
                "live": null
        },
        {
            "flight_date": "2023-05-23",
                "flight_status": "active",
                "departure": {
            "airport": "Muang Ubon",
                    "timezone": "Asia/Bangkok",
                    "iata": "UBP",
                    "icao": "VTUU",
                    "terminal": null,
                    "gate": null,
                    "delay": 12,
                    "scheduled": "2023-05-23T16:35:00+00:00",
                    "estimated": "2023-05-23T16:35:00+00:00",
                    "actual": "2023-05-23T16:46:00+00:00",
                    "estimated_runway": "2023-05-23T16:46:00+00:00",
                    "actual_runway": "2023-05-23T16:46:00+00:00"
        },
            "arrival": {
            "airport": "Suvarnabhumi International",
                    "timezone": "Asia/Bangkok",
                    "iata": "BKK",
                    "icao": "VTBS",
                    "terminal": null,
                    "gate": null,
                    "baggage": null,
                    "delay": null,
                    "scheduled": "2023-05-23T17:45:00+00:00",
                    "estimated": "2023-05-23T17:45:00+00:00",
                    "actual": null,
                    "estimated_runway": null,
                    "actual_runway": null
        },
            "airline": {
            "name": "VietJet Air",
                    "iata": "VJ",
                    "icao": "VJC"
        },
            "flight": {
            "number": "225",
                    "iata": "VJ225",
                    "icao": "VJC225",
                    "codeshared": null
        },
            "aircraft": null,
                "live": null
        }

        };

        // Convert the JSON object to a JSON string
        ObjectMapper mapper = new ObjectMapper();
        String json;

        try {
            json = mapper.writeValueAsString(flights);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
        return null;
    }
}
