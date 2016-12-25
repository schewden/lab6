package com.yanaguseva.webservice.beans;


import com.yanaguseva.webservice.WeatherString;

import java.util.ArrayDeque;
import java.util.Queue;

public class WeatherAnswer {
    private int HOURS_IN_DAY = 24;
    private Queue<WeatherString> weatherQueue = new ArrayDeque<WeatherString>(HOURS_IN_DAY);

    public Queue<WeatherString> getWeatherQueue() {
        return weatherQueue;
    }

    public void put(WeatherString weatherString) {
        if (weatherQueue.size() == HOURS_IN_DAY) {
            weatherQueue.poll();
        }
        weatherQueue.add(weatherString);
    }
}
