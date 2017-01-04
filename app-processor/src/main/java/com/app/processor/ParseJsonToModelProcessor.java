package com.app.processor;

import com.app.processor.model.ModelForParser.OpenWeather;
import com.app.processor.utils.ParserJsonToModel;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * Created by kobri on 31.12.2016.
 */
@Component
public class ParseJsonToModelProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);

        OpenWeather openWeather = ParserJsonToModel.jsonToModel(body);
        exchange.getOut().setBody(openWeather);
    }
}
