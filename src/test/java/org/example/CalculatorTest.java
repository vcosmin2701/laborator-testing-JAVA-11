package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void TestMultiply() {
        Calculator calc = new Calculator(4);
        calc.multiply(2);
        assertEquals(8, calc.getResult());
    }

    @Test
    void TestAddition() {
        Calculator calc = new Calculator(4);
        calc.addition(1);
        assertEquals(5, calc.getResult());
    }

    @Test
    void TestDivision() {
        Calculator calc = new Calculator(4);
        float actualResult = calc.division(2).getResult();
        assertEquals(2, actualResult);
    }

    @Test
    void TestSquareRoot() {
        Calculator calc = new Calculator(4);
        float actualResult = calc.squareRoot().getResult();
        assertEquals(2, actualResult);
    }

    @Test
    public void TestConstructorAndGetResult() {
        Calculator calculator = new Calculator(10);
        float actualResult = calculator.getResult();
        assertEquals(10, actualResult);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator(10);
        RuntimeException ex = assertThrows(RuntimeException.class, () -> calculator.division(0));
        assertTrue(ex.getMessage().equals("Can't divide by zero"));
    }

    @Test
    public void testSquareRoot_negativeNumber() {
        Calculator calculator = new Calculator(-4);
        Assertions.assertThrows(IllegalArgumentException.class, calculator::squareRoot);
    }



}