public class Mustard extends Topping{
    private double price = 0.50;

    public Mustard(Food food){
        super(food);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + price;
    }

    @Override
    public String getName(){
        return super.getName() + " Mustard";
    }
}
