package no.finntech.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CalculatorRoute extends RouteBuilder {

    private String out = "vm:add_out";
    private String in = "vm:add_in";

    @Override
    public void configure() throws Exception {
        from(in).to(out);
    }
}
