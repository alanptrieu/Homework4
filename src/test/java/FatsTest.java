import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatsTest {

    @Test
    void testAvocadoGetName() {
        Fats avocado = new Avocado();
        assertEquals("Avocado", avocado.getName());
    }
    @Test
    void testPeanutsGetName(){
        Fats peanuts = new Peanuts();
        assertEquals("Peanuts", peanuts.getName());
    }
    @Test
    void testSourCreamGetName(){
        Fats sourCream = new SourCream();
        assertEquals("SourCream", sourCream.getName());
    }
    @Test
    void testTunaGetName(){
        Fats tuna = new Tuna();
        assertEquals("Tuna", tuna.getName());
    }

}