package org.app.rest;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/sample")
public class EndPoint {

    @EndpointInject(uri = "direct-vm:getEvents")
    private ProducerTemplate getEvents;

    @EndpointInject(uri = "direct-vm:getCityByOpenWeather")
    private ProducerTemplate getCity;

    @EndpointInject(uri = "direct-vm:getManyCityByOpenWeather")
    private ProducerTemplate getManyCity;

    @EndpointInject(uri = "direct-vm:sendJsonToFreemarker")
    private ProducerTemplate getFreemarker;


    @GET
    @Path("/freemarker/{city}")
    @Produces("application/json")
    public Response getFreemarker(@PathParam("city") String city){
        final Map<String, Object> headers = new HashMap<String, Object>();
        headers.put( "ok", "ok" );

        Object response =  getFreemarker.requestBody( city );

        return Response.status( 200 )
                .entity( response )
                .build();
    }

    @GET
    @Path("/events")
    @Produces("application/json")
    public Response getEvents(){
        final Map<String, Object> headers = new HashMap<String, Object>();
        headers.put( "ok", "ok" );

        String response = (String) getEvents.requestBody(headers);
        return Response.status( 200 )
                .entity(response)
                .build();
    }

    @GET
    @Path("/openweather/{city}")
    @Produces("application/json")
    public Response getCity(@PathParam("city") String city){

        Object response =  getCity.requestBody(city);

        return Response.status( 200 )
                .entity( response )
                .build();
    }

    @GET
    @Path("/openweather/many/{city}")
    @Produces("application/json")
    public Response getManyCity(@PathParam("city") String city){

        final Map<String, Object> headers = new HashMap<String, Object>();
        headers.put( "ok", "ok" );

        Object response = getManyCity.requestBodyAndHeaders(city, headers);
       // System.out.println("rest" + response);

        return Response.status( 200 )
                .entity( response )
                .build();
    }
}
