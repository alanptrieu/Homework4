import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MustardTest {

    @Test
    void testGetPrice(){
        Food burger = new Burger();
        burger = new Mustard(burger);
        assertEquals(10.50, burger.getPrice());
    }

    @Test
    void testGetName(){
        Food burger = new Burger();
        burger = new Mustard(burger);
        assertEquals("Burger Mustard", burger.getName());
    }
}