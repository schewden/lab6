package com.shevelev;

import com.shevelev.service.WeatherServiceReply;
import org.springframework.context.annotation.Bean;

/**
 * Created by Денис on 25.12.2016.
 */
public class Configuration {
    @Bean
    public WeatherServiceReply weatherAnswer() {
        return new WeatherServiceReply();
    }
}