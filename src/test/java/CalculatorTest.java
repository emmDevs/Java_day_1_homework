import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(4, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(5.4, calculator.divide(13.5, 2.5), 0.01);
    }
}
