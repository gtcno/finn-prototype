package no.finntech.integration;


import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.spring.javaconfig.SingleRouteCamelConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("no.finntech.integration")
public class CamelContextConfig extends SingleRouteCamelConfiguration {

    @Override
    protected void setupCamelContext(CamelContext camelContext) throws Exception {
        // setup the ActiveMQ component
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("vm://localhost.finnIntegration?marshal=false&broker.persistent=false&broker.useJmx=false");

        // and register it into the CamelContext
        JmsComponent answer = new JmsComponent();
        answer.setConnectionFactory(connectionFactory);
        camelContext.addComponent("jms", answer);
    }

    @Bean
    @Override
    public RouteBuilder route() {
        return new CalculatorRoute();
    }


}
