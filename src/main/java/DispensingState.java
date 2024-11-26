public class DispensingState implements StateOfVendingMachine {

    @Override
    public void selectSnack(VendingMachine vendingMachine){
        System.out.println(". . Dispensing Snack");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine){
        System.out.println(". . Invalid");
    }
}
