package com.app.processor.model.detailsForOpenWeatherModel;

/**
 * Created by andrey on 03.01.17.
 */
public class Wind {
    private Double speed;

    private int deg;

    private int gust;

    public Wind() {
    }

    public Wind(Double speed, int deg, int gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public int getGust() {
        return gust;
    }

    public void setGust(int gust) {
        this.gust = gust;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                ", gust=" + gust +
                '}';
    }
}
