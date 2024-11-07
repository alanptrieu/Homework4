public class Burger implements Food{
    private double price = 10.00;

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getName(){
        return "Burger";
    }
}
