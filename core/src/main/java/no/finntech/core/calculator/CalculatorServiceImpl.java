package no.finntech.core.calculator;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: gtc
 * Date: 04.02.13
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public double add(double arg1, double arg2) {
        return arg1 + arg2;
    }

    @Override
    public String ping() {
        return "ping";
    }
}
