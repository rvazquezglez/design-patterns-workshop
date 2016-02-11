package com.nearsoft.workshop.decorator;

public class OperatorDecorator implements ArithmeticOperator {
    protected ArithmeticOperator operatorToBeDecorated;

    public OperatorDecorator(ArithmeticOperator operatorToBeDecorated) {
        this.operatorToBeDecorated = operatorToBeDecorated;
    }

    @Override
    public Double apply(Double a, Double b) {
        return this.operatorToBeDecorated.apply(a, b);
    }
}
