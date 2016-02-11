package com.nearsoft.workshop.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDecorator extends OperatorDecorator {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public LogDecorator(ArithmeticOperator operatorToBeDecorated) {
        super(operatorToBeDecorated);
    }

    @Override
    public Double apply(Double a, Double b) {
        Double result = super.apply(a, b);
        additionalBehaviour(result);
        return result;
    }

    private void additionalBehaviour(Double result) {
        log.info("Resultado: " + result);
    }
}
