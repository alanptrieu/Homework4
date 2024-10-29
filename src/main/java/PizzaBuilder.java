import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
    public String size;
    public List<String> toppings = new ArrayList<String>();
    public String chain;

    public PizzaBuilder(String size){
        this.size = size;
    }

    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public PizzaBuilder setTopping(String topping){
        this.toppings.add(topping);
        return this;
    }

    public Pizza createPizza(){
        return new Pizza(this);
    }
}
