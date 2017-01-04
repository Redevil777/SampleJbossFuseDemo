package by.app.route;

import com.app.processor.ParseJsonToModelProcessor;
import com.app.processor.OpenWeatherProcessor;
import com.app.processor.SampleProcessor;
import com.app.processor.model.OpenWeatherModel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SampleRouteBuilder extends RouteBuilder {

    @Resource
    private SampleProcessor sampleProcessor;

    @Resource
    private OpenWeatherProcessor openWeatherProcessor;

    /*@Resource
    private OpenWeather openWeather;*/

    @Resource
    private ParseJsonToModelProcessor sendJsonToFreemarker;

    private String url = "http://api.openweathermap.org/data/2.5/weather?appid=e887cf2c4ac937d0638a90d3b52147c&q=${body}&units=metric";

    @Override
    public void configure() throws Exception {
        from("direct-vm:getEvents")
                .process( sampleProcessor )
                .end();

        from("direct-vm:sendJsonToFreemarker")
                .log("before --  ${body}  ---  end before")
                .split(body().tokenize(","), new MyOrderStrategy())
                .recipientList(simple(url))
                //.unmarshal().json(JsonLibrary.Gson, OpenWeatherModel.class)
                .process( sendJsonToFreemarker )
                .log("after --- ${body} ----  end after")
                .to("freemarker:template/index.ftl")
                .end();

        from("direct-vm:getCityByOpenWeather")
                .recipientList(simple(url))
                .end();

        from("direct-vm:getManyCityByOpenWeather")
                .split(body().tokenize(","), new MyOrderStrategy())
                .log("before ${body}")
                .recipientList(simple(url))
                .log("after ${body}")
                .end();
    }
}
