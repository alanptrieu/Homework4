public class VendingMachineDriver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(10.0);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(5.0);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(2.0);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(1.00);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(0.25);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(10.0);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(0.25);
        vendingMachine.dispenseSnack();

    }
}
