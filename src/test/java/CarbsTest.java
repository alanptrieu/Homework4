import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarbsTest {

    @Test
    void testBreadGetName(){
        Carbs bread = new Bread();
        assertEquals("Bread", bread.getName());
    }
    @Test
    void testCheeseGetName(){
        Carbs cheese = new Cheese();
        assertEquals("Cheese", cheese.getName());
    }
    @Test
    void testLentilsGetName(){
        Carbs lentils = new Lentils();
        assertEquals("Lentils", lentils.getName());
    }
    @Test
    void testPistachioGetName(){
        Carbs pistachio = new Pistachio();
        assertEquals("Pistachio", pistachio.getName());
    }
}