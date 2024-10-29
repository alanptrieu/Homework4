import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer("John", "Test");
        assertEquals("John", customer.getName());
    }

    @Test
    void getDietPlan() {
        Customer customer = new Customer("John", "Test");
        assertEquals("Test", customer.getDietPlan());
    }
}