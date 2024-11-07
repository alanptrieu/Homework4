public class Ketchup extends Topping{
    private double price = 0.50;

    public Ketchup(Food food){
        super(food);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + price;
    }

    @Override
    public String getName(){
        return super.getName() + " Ketchup";
    }
}
