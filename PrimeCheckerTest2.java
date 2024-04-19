import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest2 {

    @Test
    public void testIsPrimeNumber_PrimeNumber() {
        PrimeChecker pc = new PrimeChecker();
        assertTrue(pc.isPrimeNumber(17));
    }

    @Test
    public void testIsPrimeNumber_NotPrimeNumber() {
        PrimeChecker pc = new PrimeChecker();
        assertFalse(pc.isPrimeNumber(10));
    }

    @Test
    public void testIsPrimeNumber_LessThanTwo() {
        PrimeChecker pc = new PrimeChecker();
        assertFalse(pc.isPrimeNumber(1));
        assertFalse(pc.isPrimeNumber(0));
        assertFalse(pc.isPrimeNumber(-5));
    }

    @Test
    public void testIsPrimeNumber_InvalidInput() {
        PrimeChecker pc = new PrimeChecker();
        assertFalse(pc.isPrimeNumber(Integer.MIN_VALUE));
        assertFalse(pc.isPrimeNumber(Integer.MAX_VALUE));
    }
}
