public class WaitingForMoneyState implements StateOfVendingMachine {

    @Override
    public void selectSnack(VendingMachine vendingMachine) {
        System.out.println(". . Snack selected: " + vendingMachine.getSelectedSnack().getName());
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        vendingMachine.setState(new WaitingForMoneyState());
        System.out.println(". . Waiting for money");
    }
}
