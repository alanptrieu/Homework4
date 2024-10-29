public class PizzaDriver{
    public static void main(String[] args){
        Pizza pizzaHutSmall = new PizzaBuilder("Small").setChain("Pizza Hut").setTopping("Pepperoni").setTopping("Sausage")
                        .setTopping("Mushrooms").createPizza();

        Pizza pizzaHutMedium = new PizzaBuilder("Medium").setChain("Pizza Hut").setTopping("Pepperoni").setTopping("Sausage")
                .setTopping("Mushrooms").setTopping("Bacon").setTopping("Onions").setTopping("Peppers").createPizza();

        Pizza pizzaHutLarge = new PizzaBuilder("Large").setChain("Pizza Hut").setTopping("Pepperoni").setTopping("Sausage")
                .setTopping("Mushrooms").setTopping("Bacon").setTopping("Onions").setTopping("Peppers").setTopping("Chicken")
                .setTopping("Olives").setTopping("Spinach").createPizza();

        pizzaHutSmall.eat();
        pizzaHutMedium.eat();
        pizzaHutLarge.eat();

        Pizza pizzaHutLarge3 = new PizzaBuilder("Large").setChain("Pizza Hut").setTopping("Pepperoni").setTopping("Sausage")
                .setTopping("Mushrooms").createPizza();
        Pizza pizzaHutSmall2 = new PizzaBuilder("Small").setChain("Pizza Hut").setTopping("Pepperoni").setTopping("Sausage")
                .createPizza();
        Pizza littleCaesarsMedium8 = new PizzaBuilder("Medium").setChain("Little Caesars").setTopping("Pepperoni").setTopping("Sausage")
                .setTopping("Mushrooms").setTopping("Bacon").setTopping("Onions").setTopping("Peppers").setTopping("Chicken").setTopping("Olives")
                .createPizza();
        Pizza littleCaesarsSmall6 = new PizzaBuilder("Small").setChain("Little Caesars").setTopping("Pepperoni").setTopping("Sausage")
                .setTopping("Mushrooms").setTopping("Bacon").setTopping("Onions").setTopping("Peppers").createPizza();
        Pizza dominosSmall1 = new PizzaBuilder("Small").setChain("Dominos").setTopping("Pepperoni").createPizza();
        Pizza dominosLarge3 = new PizzaBuilder("Large").setChain("Dominos").setTopping("Pepperoni").setTopping("Sausage")
                .setTopping("Mushrooms").createPizza();

        pizzaHutLarge3.eat();
        pizzaHutSmall2.eat();
        littleCaesarsMedium8.eat();
        littleCaesarsSmall6.eat();
        dominosSmall1.eat();
        dominosLarge3.eat();
    }
}
