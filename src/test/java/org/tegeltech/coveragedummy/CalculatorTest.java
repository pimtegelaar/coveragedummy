package org.tegeltech.coveragedummy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() throws Exception {
        int result = calculator.add(5, 6);
        assertThat(result, is(11));
    }

    @Test
    public void substract() throws Exception {
        calculator.substract(6, 5);
    }

    @Test
    public void multiply() throws Exception {
        int result = calculator.multiply(6, 7);
        assertThat(result, is(42));
    }

}