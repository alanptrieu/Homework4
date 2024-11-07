import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyaltyTest {

    @Test
    void testApplyDiscount(){
        double total = 100.00;
        Loyalty loyal = new Loyalty(true);
        Loyalty nonloyal = new Loyalty(false);

        assertEquals(80.00, loyal.applyDiscount(total));
        assertEquals(total, nonloyal.applyDiscount(total));
    }
}