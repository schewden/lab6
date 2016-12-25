package com.shevelev;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * Created by Денис on 25.12.2016.
 */
@SpringBootApplication
@EnableScheduling
public class WeatherMain {
    public static void main(String[] args) {
        SpringApplication.run(WeatherMain.class, args);
    }
}
