package com.dryfire.airlinemanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "testdb")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Flight {

    @Id
    private int flightNo;
    private String timeDeparture;
    private String timeArrival;
    private String flightFrom;
    private String flightTo;
    private float flightFare;






}
