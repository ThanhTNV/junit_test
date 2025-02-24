import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestCalculatorCsv {
    Calculator math = new Calculator();

    @ParameterizedTest
    @CsvFileSource(resources = "/cal.csv", numLinesToSkip = 1)
    void TestCalculator(int a, int b, int add, int minus, int multiply, float divide, float delta) {
        assertEquals(math.add(a, b), add);
        assertEquals(math.minus(a, b), minus);
        assertEquals(math.multiply(a, b), multiply);
        assertEquals(math.divide(a, b), divide, delta);
    }
}
