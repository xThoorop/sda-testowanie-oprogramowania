package _01_;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OurFirstUnitTest {

    @Test
    void shouldMultiplyTwoNumbersTest(){
        //given
        double firstNumber = 2;
        double secondNumber = 4;

        //when
        double result = firstNumber * secondNumber;

        //then
        Assertions.assertEquals(8, result);
    }

}