import java.util.*;

public class VendingMachine {
    private StateOfVendingMachine state;
    private double moneyInserted;
    private Snack selectedSnack;
    private SnackDispenseHandler snackDispenseHandler;
    private Map<String, Snack> snacks;

    public VendingMachine() {
        this.state = new IdleState();
        this.moneyInserted = 0;
        this.snacks = new HashMap<>();
        this.snackDispenseHandler = SnackDispenseHandler.createSnackDispenseChain();

        snacks.put("Coke", new Snack("Coke", 1.00, 5));
        snacks.put("Pepsi", new Snack("Pepsi", 1.00, 5));
        snacks.put("Cheetos", new Snack("Cheetos", 1.00, 5));
        snacks.put("Doritos", new Snack("Doritos", 1.00, 5));
        snacks.put("KitKat", new Snack("KitKat", 0.50, 5));
        snacks.put("Snickers", new Snack("Snickers", 0.50, 1));
    }

    public void selectSnack(String snackName) {
        selectedSnack = snacks.get(snackName);
        System.out.println("Selected snack: " + snackName);
        state.selectSnack(this);
    }

    public void insertMoney(double amount) {
        moneyInserted += amount;
        state.insertMoney(this);
    }

    public void dispenseSnack() {
        snackDispenseHandler.handleRequest(this);
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void setMoneyInserted(double moneyInserted) {
        this.moneyInserted = moneyInserted;
    }

    public double getMoneyInserted(){
        return moneyInserted;
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }
}
