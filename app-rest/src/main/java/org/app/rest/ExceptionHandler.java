package org.app.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception e) {
        String message = "";
        int code = 0;
        if(e instanceof WebApplicationException){
            WebApplicationException exception = (WebApplicationException) e;
            code = exception.getResponse().getStatusInfo().getStatusCode();
            message = exception.getMessage();
        } else {
            System.out.println(e.getClass());
            code = 500;
            message = e.getMessage();
        }

        return Response.status( code )
                .entity(message)
                .build();
    }
}
