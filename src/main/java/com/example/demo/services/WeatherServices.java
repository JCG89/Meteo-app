package com.example.demo.services;

import com.example.demo.client.WeatherClient;
import com.example.demo.model.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherServices {
    private final WeatherClient weatherClient;
    public ResponseEntity<Weather> getParisMeteo(){

        return weatherClient.getWeatherInParis();
    }
}
