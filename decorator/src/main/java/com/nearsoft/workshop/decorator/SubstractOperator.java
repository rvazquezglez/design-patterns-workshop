package com.nearsoft.workshop.decorator;

public class SubstractOperator implements ArithmeticOperator {
    @Override
    public Double apply(Double a, Double b) {
        return a - b;
    }
}
