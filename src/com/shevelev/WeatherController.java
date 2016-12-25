package com.shevelev;

import com.shevelev.service.WeatherServiceReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Денис on 25.12.2016.
 */
@RestController
public class WeatherController {
    @Autowired
    WeatherServiceReply weatherAnswer;

    @RequestMapping("/weather")
    public WeatherServiceReply getWeather() {
        return weatherAnswer;
    }
}
