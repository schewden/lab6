package com.yanaguseva.webservice.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import com.yanaguseva.webservice.WeatherString;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class WeatherService {
    private YahooWeatherService service = new YahooWeatherService();

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyy");
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public WeatherService() throws JAXBException {
    }

    public WeatherString getWeather() {
        try {
            Channel channel = service.getForecastForLocation("Saint-Petersburg", DegreeUnit.CELSIUS).first(1).get(0);
            return new WeatherString(dateFormat.format(new Date()),
                    timeFormat.format(new Date()), channel.getItem().getCondition().getTemp());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
