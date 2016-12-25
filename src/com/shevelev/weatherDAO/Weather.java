package com.shevelev.weatherDAO;

import com.github.fedy2.weather.data.Channel;

/**
 * Created by Денис on 25.12.2016.
 */
public class Weather {
    private String date;
    private String time;
    private Channel temperature;

    public Weather(String date, String time, Channel temperature) {
        this.date = date;
        this.time = time;
        this.temperature = temperature;
    }
}
