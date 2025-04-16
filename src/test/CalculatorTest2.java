package test;

import static org.junit.jupiter.api.Assertions.*;
import main.Calculator;
import org.junit.Test;

public class CalculatorTest2 {
  Calculator calc = new Calculator();

  @Test(expected = ArithmeticException.class)
  public void testDivideByZero() {
    calc.divide(5, 0);
  }

  @Test
  public void testSquare() {
    assertEquals(9, calc.square(3));
  }

  @Test
  public void testSquareRoot() {
    assertEquals(3, calc.squareRoot(9));
  }
}
