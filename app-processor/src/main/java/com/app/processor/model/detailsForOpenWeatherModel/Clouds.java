package com.app.processor.model.detailsForOpenWeatherModel;

/**
 * Created by andrey on 03.01.17.
 */
public class Clouds {
    private int all;

    public Clouds() {
    }

    public Clouds(int all) {
        this.all = all;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}
