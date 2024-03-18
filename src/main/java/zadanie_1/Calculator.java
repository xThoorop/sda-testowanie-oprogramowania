package zadanie_1;

import zadanie_1.enums.MathChar;

public class Calculator {

    // zad. 1
// Stwórz klasę Calculator dwóch liczb, w której zaimplementujesz działania:
// dodawanie, odejmowanie, mnożenie, dzielenie. Na razie nie przejmuj się
// obsługą dzielenia przez 0.
//
// Następnie stwórz klasę CalculatorTest, w której przetestujesz powyższe metody.




    public double calculate(double firstDouble, double secondDouble, MathChar mathChar) throws Exception {
        switch (mathChar) {

            case ADDTION: {
                return firstDouble + secondDouble;
            }
            case SUBTRACTION: {
                return firstDouble - secondDouble;
            }
            case DIVISION: {
                return firstDouble / secondDouble;
            }
            case MULTIPLICATION: {
                return firstDouble * secondDouble;
            }
            default: throw new Exception("Bledne wartosci");
        }


    }
}
