package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void multiply() {
        // arrange
        Calculator calc = new Calculator(4);
        // act
        calc.multiply(2);
        // assert
        assertEquals(8, calc.getResult());
    }

    @Test
    void addition() {
        Calculator calc = new Calculator(4);
        calc.addition(1);
        assertEquals(5, calc.getResult());
    }

    @Test
    void division() {
        Calculator calc = new Calculator(4);
        float actualResult = calc.division(2).getResult();
        assertEquals(2, actualResult, "4/2 did not produce 2");
    }

    @Test
    void squareRoot() {
    }
}