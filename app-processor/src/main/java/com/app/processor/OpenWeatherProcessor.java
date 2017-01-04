package com.app.processor;

import com.app.processor.utils.GetJsonFromOpenWeather;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * Created by kobri on 26.12.2016.
 */
@Component
public class OpenWeatherProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        String response = GetJsonFromOpenWeather.getJson(exchange.getIn().getBody().toString());

        //System.out.println(response);

        exchange.getOut().setBody(response);
    }
}
