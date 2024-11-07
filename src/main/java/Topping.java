public class Topping implements Food{
    protected Food food;

    public Topping(Food food) {
        this.food = food;
    }

    @Override
    public double getPrice(){
        return food.getPrice();
    }

    @Override
    public String getName(){
        return food.getName();
    }
}
