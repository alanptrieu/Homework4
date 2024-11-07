import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KetchupTest {

    @Test
    void testGetPrice(){
        Food burger = new Burger();
        burger = new Ketchup(burger);
        assertEquals(10.50, burger.getPrice());
    }

    @Test
    void testGetName(){
        Food burger = new Burger();
        burger = new Ketchup(burger);
        assertEquals("Burger Ketchup", burger.getName());
    }
}