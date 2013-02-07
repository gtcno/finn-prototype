package no.finntech.rest.calculator;

import no.finntech.core.calculator.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: gtc
 * Date: 04.02.13
 * Time: 22:48
 * To change this template use File | Settings | File Templates.
 */
@Path("/calculator")
@Service
public class CalculatorResource {

    @Autowired
    private CalculatorService calculatorService;

    @GET
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response add(@QueryParam("arg1") double arg1, @QueryParam("arg2") double arg2) {
        double result = calculatorService.add(arg1, arg2);
        String resultString = String.valueOf(result);
        return Response.ok().entity(resultString).build();
    }

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok(calculatorService.ping()).build();
    }

    @GET
    @Path("/hello")
    public Response hello(@QueryParam("name") String name) {
        return Response.ok("Hello " + name).build();
    }
}
