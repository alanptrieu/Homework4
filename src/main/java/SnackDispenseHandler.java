public class SnackDispenseHandler {
    public String snackName;
    public SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(String snackName, SnackDispenseHandler nextHandler) {
        this.snackName = snackName;
        this.nextHandler = nextHandler;
    }

    public void handleRequest(VendingMachine vendingMachine) {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        double moneyInserted = vendingMachine.getMoneyInserted();

        if (selectedSnack.name.equals(snackName)) {
            if (selectedSnack.quantity > 0 && moneyInserted >= selectedSnack.price){
                selectedSnack.reduceQuantity();
                System.out.println(". . Purchased");
                double change = moneyInserted - selectedSnack.price;

                vendingMachine.setMoneyInserted(0);

                if (change > 0) {
                    System.out.println(". . Returning Change " + change);
                }

            } else if (selectedSnack.quantity == 0){
                System.out.println(". . Out of stock");
            } else {
                System.out.println(". . Not enough money");
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(vendingMachine);
        }
    }

    public static SnackDispenseHandler createSnackDispenseChain() {
        SnackDispenseHandler cokeHandler = new SnackDispenseHandler("Coke", null);
        SnackDispenseHandler pepsiHandler = new SnackDispenseHandler("Pepsi", cokeHandler);
        SnackDispenseHandler cheetosHandler = new SnackDispenseHandler("Cheetos", pepsiHandler);
        SnackDispenseHandler doritosHandler = new SnackDispenseHandler("Doritos", cheetosHandler);
        SnackDispenseHandler kitkatHandler = new SnackDispenseHandler("KitKat", doritosHandler);

        return new SnackDispenseHandler("Snickers", kitkatHandler);
    }
}
