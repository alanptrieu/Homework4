public class Loyalty{
    private boolean isLoyal;

    public Loyalty(boolean isLoyal){
        this.isLoyal = isLoyal;
    }

    public double applyDiscount(double total){
        if(isLoyal){
            return total - (total * 0.20);
        } else{
            return total;
        }

    }
}
