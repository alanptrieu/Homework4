import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    public VendingMachine vendingMachine;

    @BeforeEach
    public void setUp() {
        vendingMachine = new VendingMachine();
    }

    @Test
    void selectSnack() {
        vendingMachine.selectSnack("Coke");
        assertEquals("Coke", vendingMachine.getSelectedSnack().getName());
    }

    @Test
    void insertMoney() {
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(10);
        vendingMachine.dispenseSnack();

        assertEquals(0, vendingMachine.getMoneyInserted());
    }

}