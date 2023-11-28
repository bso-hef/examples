package tests;

import de.bso.java.examples.tests.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTestJUnit {

    Calculator calculator = new Calculator();

    @Test
    void addition() {

        Assertions.assertEquals(0, calculator.addition(0, 0));

        Assertions.assertEquals(0, calculator.addition(-1, 1));

        Assertions.assertEquals(Integer.MAX_VALUE, calculator.addition(Integer.MAX_VALUE - 1, 1));

        Assertions.assertEquals(Integer.MIN_VALUE + 1, calculator.addition(Integer.MIN_VALUE, 1));
    }

    @Test
    void substraction() {

        Assertions.assertEquals(0, calculator.substraction(1, 1));
    }
}