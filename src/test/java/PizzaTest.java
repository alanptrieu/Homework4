import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PizzaTest {

    @Test
    void testEat() {
        PizzaBuilder builder = new PizzaBuilder("Medium").setChain("Pizza Hut").setTopping("Onions");
        Pizza pizza = builder.createPizza();
        pizza.eat();
        assertEquals("Medium", pizza.size);
        assertTrue(pizza.toppings.contains("Onions"));

    }
}