package com.nearsoft.workshop.decorator;

public class SumOperator implements ArithmeticOperator {
    @Override
    public Double apply(Double a, Double b) {
        return a + b;
    }
}
