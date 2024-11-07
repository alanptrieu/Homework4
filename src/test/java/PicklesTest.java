import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PicklesTest {

    @Test
    void testGetPrice(){
        Food burger = new Burger();
        burger = new Pickles(burger);
        assertEquals(10.50, burger.getPrice());
    }

    @Test
    void testGetName(){
        Food burger = new Burger();
        burger = new Pickles(burger);
        assertEquals("Burger Pickles", burger.getName());
    }
}