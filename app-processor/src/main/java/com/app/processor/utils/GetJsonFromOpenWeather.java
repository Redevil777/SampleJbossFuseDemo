package com.app.processor.utils;


import org.springframework.web.client.RestTemplate;

public class GetJsonFromOpenWeather {

    public static String getJson(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=e887cf2c4eac937d0638a90d3b52147c";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
