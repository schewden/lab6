package com.yanaguseva.webservice.config;

import com.yanaguseva.webservice.beans.WeatherAnswer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public WeatherAnswer weatherAnswer() {
        return new WeatherAnswer();
    }
}
