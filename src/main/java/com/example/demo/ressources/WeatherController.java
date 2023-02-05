package com.example.demo.ressources;

import com.example.demo.model.Weather;
import com.example.demo.services.WeatherServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherServices weatherServices;
    @GetMapping("paris")
    protected ResponseEntity<Weather> getWeatherInParis(){
        return weatherServices.getParisMeteo();
    }
}
