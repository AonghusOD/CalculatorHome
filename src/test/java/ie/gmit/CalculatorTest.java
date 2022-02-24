package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void justAnExample() {
    }
    @Test
    void testSubtract() {
        assertEquals(7, calc.subtract(17,10));
    }

    @Test
    void testMultiply() {
        assertEquals(170, calc.multiply(17,10));
    }

    @Test
    void testDivide() {
        assertEquals(10, calc.divide(100,10));
    }
}