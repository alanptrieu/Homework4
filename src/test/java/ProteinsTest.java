import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProteinsTest {

    @Test
    void testBeefGetName(){
        Proteins beef = new Beef();
        assertEquals("Beef", beef.getName());
    }
    @Test
    void testChickenGetName(){
        Proteins chicken = new Chicken();
        assertEquals("Chicken", chicken.getName());
    }
    @Test
    void testFishGetName(){
        Proteins fish = new Fish();
        assertEquals("Fish", fish.getName());
    }
    @Test
    void testTofuGetName(){
        Proteins tofu = new Tofu();
        assertEquals("Tofu", tofu.getName());
    }

}