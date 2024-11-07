import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> foods = new ArrayList<>();

    public void addFood(Food food){
        foods.add(food);
    }

    public double getTotal(){
        double total = 0.0;
        for(Food food : foods){
            total += food.getPrice();
        }
        return total;
    }

    public String getOrder(){
        StringBuilder order = new StringBuilder();
        for(Food food : foods){
            order.append(food.getName());
            order.append("\n");
        }
        return order.toString();
    }
}
