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
        assertEquals(7, calc.subtract(10,17));
    }
}