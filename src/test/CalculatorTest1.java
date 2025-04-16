package test;

import org.junit.Test;
import main.Calculator;
import static org.junit.Assert.*;

public class CalculatorTest1 {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }
    
}