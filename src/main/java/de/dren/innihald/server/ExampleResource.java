package de.dren.innihald.server;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(value = "example.resource.hello.count")
    @Timed(value = "example.resource.hello.time")
    public String hello() {
        return "Hello RESTEasy";
    }
}