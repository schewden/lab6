package com.shevelev.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import com.shevelev.weatherDAO.Weather;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Денис on 25.12.2016.
 */
public class WeatherService {
    public Weather getWeather() throws JAXBException, IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        YahooWeatherService service = new YahooWeatherService();
        Channel channel = service.getForecast("2123260", DegreeUnit.CELSIUS);
        return new Weather(dateFormat.format(new Date()), timeFormat.format(new Date()), channel);
    }
}