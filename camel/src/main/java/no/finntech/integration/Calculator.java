package no.finntech.integration;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add (AddMessage message){
        return message.getFirst()+message.getSecond();
    }
}
