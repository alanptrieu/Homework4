public class Fries implements  Food{
    private double price = 5.00;

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getName(){
        return "Fries";
    }
}
