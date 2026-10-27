import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    public void testFirstBigger() {
        assertEquals("5.0 2.0", Task3.order(5, 2));
    }

    @Test
    public void testSecondBigger() {
        assertEquals("7.5 3.0", Task3.order(3, 7.5));
    }

    @Test
    public void testEqual() {
        assertEquals("4.0 4.0", Task3.order(4, 4));
    }
}
