package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Weather implements Serializable {

    @JsonProperty("current_weather")//Pour changer current_weather en currentWeather
    private CurrentWeather currentWeather;

    private String latitude ;

    private String longitude;
    @JsonProperty("generationtime_ms")
    private String generationTimeMs;

    private String elevation;


}

