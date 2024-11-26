import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest {

    public Snack snack;

    @BeforeEach
    public void setUp() {
        snack = new Snack("Coke", 1.00, 10);
    }

    @Test
    void getName() {
        assertEquals("Coke", snack.getName());
    }

    @Test
    void getPrice() {
        assertEquals(1.00, snack.getPrice(), 0);
    }

    @Test
    void reduceQuantity() {
        int initialQuantity = 10;
        snack.reduceQuantity();
        assertEquals(initialQuantity - 1, 9);
    }
}