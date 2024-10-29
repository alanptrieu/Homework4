public class Customer {
    public String name;
    public String dietPlan;

    public Customer(String name, String dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName(){
        return name;
    }
    public String getDietPlan(){
        return dietPlan;
    }
}
