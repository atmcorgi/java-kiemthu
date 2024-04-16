import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    
    @Test
    public void testIsEven() {
        assertTrue(Main.isEven(2));
        assertFalse(Main.isEven(3));
    }
    
    // Bổ sung các test case khác tùy theo logic của chương trình
}
