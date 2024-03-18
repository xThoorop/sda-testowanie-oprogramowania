package zadanie_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadanie_1.enums.MathChar;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    /*
        ADDTION,
    SUBTRACTION,
    DIVISION,
    MULTIPLICATION;
     */

    @Test
    public void additionTest() throws Exception {
        double x = 1;
        double y = 1;
        double output = new Calculator().calculate(x,y, MathChar.ADDTION);
        double result = x+y;
        Assertions.assertEquals(result,output);
    }
    @Test
    public void subtractionTest() throws Exception {
        double x = 1;
        double y = 1;
        double output = new Calculator().calculate(x,y, MathChar.SUBTRACTION);
        double result = x-y;
        Assertions.assertEquals(result,output);
    }
    @Test
    public void divisionTest() throws Exception {
        double x = 1;
        double y = 1;
        double output = new Calculator().calculate(x,y, MathChar.DIVISION);
        double result = x/y;
        Assertions.assertEquals(result,output);
    }
    @Test
    public void multiplicationTest() throws Exception {
        double x = 1;
        double y = 1;
        double output = new Calculator().calculate(x,y, MathChar.MULTIPLICATION);
        double result = x*y;
        Assertions.assertEquals(result,output);
    }

}