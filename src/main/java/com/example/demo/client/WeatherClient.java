package com.example.demo.client;

import com.example.demo.model.Weather;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherClient {
//Récupérer le lien open_meteo
    private final String urlWeatherClient = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m";
    public ResponseEntity<Weather> getWeatherInParis(){

        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForEntity(urlWeatherClient, Weather.class);
    }
}
