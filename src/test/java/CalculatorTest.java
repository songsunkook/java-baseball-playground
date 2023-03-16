import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator cal;
    @BeforeEach
    public void setUp()  {
        cal = new Calculator();
    }

    @Test
    public void add()  {
        assertEquals(7, cal.add(3, 4));
    }

    @Test
    public void subtract()  {
        assertEquals(1, cal.subtract(5,  4));
    }

    @Test
    public void multiply()  {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    public void divide()  {
        assertEquals(2, cal.divide(8, 4));
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }

}
