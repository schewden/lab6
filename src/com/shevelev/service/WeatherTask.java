package com.shevelev.service;

import com.shevelev.service.WeatherServiceReply;
import com.shevelev.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by Денис on 25.12.2016.
 */
@Component
public class WeatherTask {

    @Autowired
    private WeatherServiceReply weatherServiceReply;

    @Autowired
    private WeatherService weatherService;

    @Scheduled(cron = "0 0 * * * *")
    public void getCurrentWeather() throws JAXBException, IOException {
        weatherServiceReply.setWeatherDeque(weatherService.getWeather());
    }
}