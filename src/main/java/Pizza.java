import java.util.List;

public class Pizza{
    public String size;
    public List<String> toppings;
    public String chain;

    public Pizza(PizzaBuilder builder){
        this.size = builder.size;
        this.toppings = builder.toppings;
        this.chain = builder.chain;
    }

    public void eat(){
        System.out.println("Chain: " + chain + " Size: " + size + " Toppings: " + toppings);
    }
}
