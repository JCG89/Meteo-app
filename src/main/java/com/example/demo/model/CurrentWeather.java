package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CurrentWeather implements Serializable {

    private  String temperature;

    private String windspeed;

    private String winddirection;
}
