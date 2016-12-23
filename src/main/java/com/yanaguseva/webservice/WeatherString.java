package com.yanaguseva.webservice;

public class WeatherString {
    private String date;
    private String time;
    private int temperature;

    public WeatherString(String date, String time, int temperature) {
        this.date = date;
        this.time = time;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
