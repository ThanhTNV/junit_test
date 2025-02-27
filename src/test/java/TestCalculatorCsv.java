import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestCalculatorCsv {
    Calculator math = new Calculator();

    @ParameterizedTest(name = "Test Add Function")
    @CsvFileSource(resources = "/cal.csv", numLinesToSkip = 1)
    void TestAdd(int a, int b, int add) {
        assertEquals(math.add(a, b), add);
    }

    @ParameterizedTest(name = "Test Minus Function")
    @CsvFileSource(resources = "/cal.csv", numLinesToSkip = 1)
    void TestMinus(int a, int b, int add, int minus) {
        assertEquals(math.minus(a, b), minus);
    }

    @ParameterizedTest(name = "Test Multiply Function")
    @CsvFileSource(resources = "/cal.csv", numLinesToSkip = 1)
    void TestMultiply(int a, int b, int add, int minus, int multiply) {
        assertEquals(math.multiply(a, b), multiply);
    }

    @ParameterizedTest(name = "Test Divide Function")
    @CsvFileSource(resources = "/cal.csv", numLinesToSkip = 1)
    void TestDivide(int a, int b, int add, int minus, int multiply, float divide) {
        assertEquals(math.divide(a, b), divide, 0);
    }
}
