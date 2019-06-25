
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest{

    private Calculator calc;

    @Before
    public void setUp(){
        calc=new Calculator();
    }

    @Test
    public void addTest(){
        int actual=calc.add(12,13);
        assertEquals(25,actual);
    }
}