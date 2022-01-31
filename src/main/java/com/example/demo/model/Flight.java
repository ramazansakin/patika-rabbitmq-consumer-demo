package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Flight {

    private int id;
    private String code;
    private Integer quota;
    private Integer price;
    private Date departureDate;
    private Date estimatedArrivalDate;
    private AirportCompany airportCompany;

}
