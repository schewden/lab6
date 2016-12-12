package com.yanaguseva.webservice.task;

import com.yanaguseva.webservice.beans.WeatherAnswer;
import com.yanaguseva.webservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherTask {

    @Autowired
    private WeatherAnswer weatherAnswer;

    @Autowired
    private WeatherService weatherService;

    @Scheduled(cron = "0 0 * * * *")
    public void getCurrentWeather() {
            weatherAnswer.put(weatherService.getWeather());
    }
}
