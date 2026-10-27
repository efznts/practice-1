import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    public void testZero() {
        // sin^2(0) - cos(0) + tg(0) = 0 - 1 + 0 = -1
        assertEquals(-1.0, Task2.calculate(0), 0.0001);
    }

    @Test
    public void testHalf() {
        assertEquals(0.2358, Task2.calculate(0.5), 0.0001);
    }
}
