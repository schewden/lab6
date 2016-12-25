package com.shevelev.service;

import com.shevelev.weatherDAO.Weather;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Денис on 25.12.2016.
 */

public class WeatherServiceReply {
    private Deque<Weather> weatherDeque = new ArrayDeque<>(24);

    public void setWeatherDeque(Weather weather) {
        if (weatherDeque.size() == 24) {
            weatherDeque.pollFirst();
        }
        weatherDeque.addFirst(weather);
    }
}