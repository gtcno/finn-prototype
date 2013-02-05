package no.finntech.integration;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spring.javaconfig.test.JavaConfigContextLoader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(
        locations = "no.finntech.integration.CamelContextConfig",
        loader = JavaConfigContextLoader.class)

public class CalculatorRouteTest extends AbstractJUnit4SpringContextTests {

    @EndpointInject(uri = "mock:output")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "vm:add_in")
    protected ProducerTemplate template;

    @Autowired
    CamelContext camelContext;

    @Test
    public void sendMessage() throws Exception{
        camelContext.getRouteDefinitions().get(0).adviceWith(camelContext, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                weaveAddLast().to("mock:output");
            }
        });
        resultEndpoint.expectedBodiesReceived(1);
        template.sendBody(1);
        resultEndpoint.assertIsSatisfied();
    }
}
