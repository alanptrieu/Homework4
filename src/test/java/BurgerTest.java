import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {

    @Test
    void testGetPrice(){
        Burger burger = new Burger();
        assertEquals(10.00, burger.getPrice());
    }

    @Test
    void testGetName(){
        Burger burger = new Burger();
        assertEquals("Burger", burger.getName());
    }
}