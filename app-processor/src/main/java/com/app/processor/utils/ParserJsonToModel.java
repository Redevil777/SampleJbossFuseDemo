package com.app.processor.utils;

import com.app.processor.model.ModelForParser.OpenWeather;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ParserJsonToModel {

    public static OpenWeather jsonToModel (String str) {
        JsonObject json = new JsonParser().parse(str).getAsJsonObject();

        OpenWeather openWeather = new OpenWeather();

        openWeather.setName(json.get("name").getAsString());

        openWeather.setCountry(json.get("sys").getAsJsonObject().get("country").getAsString());

        openWeather.setSunrise(
                ParserDateFromSecToLocalDateTime.fromSecToLLT(json.get("sys").getAsJsonObject().get("sunset").getAsInt()));

        openWeather.setSunset(
                ParserDateFromSecToLocalDateTime.fromSecToLLT(json.get("sys").getAsJsonObject().get("sunrise").getAsInt()));

        openWeather.setSpeedWind(json.get("wind").getAsJsonObject().get("speed").getAsDouble());

        openWeather.setTempCurrent(json.get("main").getAsJsonObject().get("temp").getAsDouble());

        openWeather.setTempMin(json.get("main").getAsJsonObject().get("temp_min").getAsDouble());

        openWeather.setTempMax(json.get("main").getAsJsonObject().get("temp_max").getAsDouble());

        openWeather.setWeatherMain(json.get("weather").getAsJsonArray().get(0).getAsJsonObject().get("main").getAsString());

        openWeather.setWeatherDescription(json.get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString());

        openWeather.setCoordLat(json.get("coord").getAsJsonObject().get("lat").getAsDouble());

        openWeather.setCoordLon(json.get("coord").getAsJsonObject().get("lon").getAsDouble());

        return openWeather;
    }
}
