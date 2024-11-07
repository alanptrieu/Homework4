import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotDogTest {

    @Test
    void testGetPrice(){
        HotDog hotDog = new HotDog();
        assertEquals(5.00, hotDog.getPrice());
    }

    @Test
    void testGetName(){
        HotDog hotDog = new HotDog();
        assertEquals("HotDog", hotDog.getName());
    }
}