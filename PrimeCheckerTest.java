import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void testIsPrimeNumber_PrimeNumber() {
        assertTrue(PrimeChecker.isPrimeNumber(17));
    }

    @Test
    public void testIsPrimeNumber_NotPrimeNumber() {
        assertFalse(PrimeChecker.isPrimeNumber(10));
    }

    @Test
    public void testIsPrimeNumber_LessThanTwo() {
        assertFalse(PrimeChecker.isPrimeNumber(1));
        assertFalse(PrimeChecker.isPrimeNumber(0));
        assertFalse(PrimeChecker.isPrimeNumber(-5));
    }
}
