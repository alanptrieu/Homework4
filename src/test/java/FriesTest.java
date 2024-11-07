import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesTest {

    @Test
    void testGetPrice(){
        Fries fries = new Fries();
        assertEquals(5.00, fries.getPrice());
    }

    @Test
    void testGetName(){
        Fries fries = new Fries();
        assertEquals("Fries", fries.getName());
    }
}