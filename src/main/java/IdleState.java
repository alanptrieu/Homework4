public class IdleState implements StateOfVendingMachine {

    @Override
    public void selectSnack(VendingMachine vendingMachine) {
        vendingMachine.setState(new WaitingForMoneyState());
        System.out.println(". . Idle");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println(". . Idle");
    }
}
