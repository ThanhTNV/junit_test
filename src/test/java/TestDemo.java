import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestDemo {
    @Test
    public void testIsPrimeNumber1() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(-1);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber2() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(0);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber3() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(1);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber4() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(2);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeNumber5() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(4);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber6() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(5);
        assertTrue(result);
    }

    @Test
    public void test_prime_numbers_return_true() {
        Demo demo = new Demo();

        assertTrue(demo.isPrimeNumber(2));
        assertTrue(demo.isPrimeNumber(3));
        assertTrue(demo.isPrimeNumber(5));
        assertTrue(demo.isPrimeNumber(7));
        assertTrue(demo.isPrimeNumber(11));
    }

    @Test
    public void test_smallest_prime_number() {
        Demo demo = new Demo();
    
        boolean result = demo.isPrimeNumber(2);
    
        assertTrue(result);
    }

    @Test
    public void test_non_prime_numbers_return_false() {
        Demo demo = new Demo();

        assertFalse(demo.isPrimeNumber(4));
        assertFalse(demo.isPrimeNumber(6));
        assertFalse(demo.isPrimeNumber(8));
        assertFalse(demo.isPrimeNumber(9));
    }

    @Test
    public void test_input_one_not_prime() {
        Demo demo = new Demo();

        assertFalse(demo.isPrimeNumber(1));
    }

    @Test
    public void test_input_zero_not_prime() {
        Demo demo = new Demo();

        assertFalse(demo.isPrimeNumber(0));
    }

    @Test
    public void test_negative_numbers_return_false() {
        Demo demo = new Demo();

        assertFalse(demo.isPrimeNumber(-1));
        assertFalse(demo.isPrimeNumber(-10));
        assertFalse(demo.isPrimeNumber(-100));
    }
}
