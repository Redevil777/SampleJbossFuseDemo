package com.app.processor.model.ModelForParser;

import java.time.LocalDateTime;

public class OpenWeather {

    private String name;

    private String country;

    private String sunset;

    private String sunrise;

    private Double speedWind;

    private Double tempCurrent;

    private Double tempMax;

    private Double tempMin;

    private String weatherMain;

    private String weatherDescription;

    private Double coordLat;

    private Double coordLon;

    public OpenWeather() {
    }


    public OpenWeather(String name, String country, String sunset, String sunrise, Double speedWind,
                       Double tempCurrent, Double tempMax, Double tempMin, String weatherMain,
                       String weatherDescription, Double coordLat, Double coordLon) {
        this.name = name;
        this.country = country;
        this.sunset = sunset;
        this.sunrise = sunrise;
        this.speedWind = speedWind;
        this.tempCurrent = tempCurrent;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.weatherMain = weatherMain;
        this.weatherDescription = weatherDescription;
        this.coordLat = coordLat;
        this.coordLon = coordLon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Double getSpeedWind() {
        return speedWind;
    }

    public void setSpeedWind(Double speedWind) {
        this.speedWind = speedWind;
    }

    public Double getTempCurrent() {
        return tempCurrent;
    }

    public void setTempCurrent(Double tempCurrent) {
        this.tempCurrent = tempCurrent;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(String weatherMain) {
        this.weatherMain = weatherMain;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Double getCoordLat() {
        return coordLat;
    }

    public void setCoordLat(Double coordLat) {
        this.coordLat = coordLat;
    }

    public Double getCoordLon() {
        return coordLon;
    }

    public void setCoordLon(Double coordLon) {
        this.coordLon = coordLon;
    }

    @Override
    public String toString() {
        return "OpenWeather{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", sunset=" + sunset +
                ", sunrise=" + sunrise +
                ", speedWind=" + speedWind +
                ", tempCurrent=" + tempCurrent +
                ", tempMax=" + tempMax +
                ", tempMin=" + tempMin +
                ", weatherMain='" + weatherMain + '\'' +
                ", weatherDescription='" + weatherDescription + '\'' +
                ", coordLat=" + coordLat +
                ", coordLon=" + coordLon +
                '}';
    }
}
