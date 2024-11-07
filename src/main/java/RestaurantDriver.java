public class RestaurantDriver{
    public static void main (String[] args){
        Loyalty loyalty01 = new Loyalty(true);
        Food burger01 = new Burger();
        Food burger02 = new Burger();
        Food fries01 = new Fries();
        Food hotDog01 = new HotDog();

        burger01 = new Ketchup(burger01);
        burger01 = new Mustard(burger01);
        burger02 = new Mustard(burger02);
        hotDog01 = new Ketchup(hotDog01);

        Order order01 = new Order();
        order01.addFood(burger01);
        order01.addFood(burger02);
        order01.addFood(fries01);
        order01.addFood(hotDog01);

        System.out.println("Order: \n" + order01.getOrder());
        System.out.println("Total: " + order01.getTotal());
        System.out.println("Discount Total: " + loyalty01.applyDiscount(order01.getTotal()));
    }
}
