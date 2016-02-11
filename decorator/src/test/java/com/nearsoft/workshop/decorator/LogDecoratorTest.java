package com.nearsoft.workshop.decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogDecoratorTest {

    @Test
    public void testSumDecorated() throws Exception {
        ArithmeticOperator sumDecorated = new LogDecorator(new SumOperator());
        Double result = sumDecorated.apply(4.0, 2.0);
        assertThat(result, is(6.0));
    }

    @Test
    public void testSubstractDecorated() throws Exception {
        ArithmeticOperator substractDecorated = new LogDecorator(new SubstractOperator());
        Double result = substractDecorated.apply(4.0, 2.0);
        assertThat(result, is(2.0));
    }
}