package no.finntech.integration;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add (int i, int j){
        return i+j;
    }
}
