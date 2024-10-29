public class CustomerDriver {
    public static void main(String[] args){
        Customer[] customers = {
                new Customer("Customer", "No Restriction"),
                new Customer("Customer2", "No Restriction"),
                new Customer("Customer3", "Paleo"),
                new Customer("Customer4", "Paleo"),
                new Customer("Customer5", "Vegan"),
                new Customer("Customer6", "Vegan"),
                new Customer("Customer7", "NutAllergy"),
                new Customer("Customer8", "NutAllergy")
        };

        Macronutrient macronutrient = new Macronutrient();

        for (Customer customer: customers){
            System.out.println("Name: " + customer.getName() + "\nDiet Plan: " + customer.getDietPlan());
            getMeal(macronutrient, customer.getDietPlan());
        }


    }
    public static void getMeal(Macronutrient macronutrient, String dietPlan){
        Macronutrient.CarbsFactory carbsFactory = macronutrient.getCarbsFactory(dietPlan);
        Macronutrient.ProteinFactory proteinFactory = macronutrient.getProteinFactory(dietPlan);
        Macronutrient.FatsFactory fatsFactory = macronutrient.getFatsFactory(dietPlan);

        Carbs carb = carbsFactory.createCarb(dietPlan);
        Proteins protein = proteinFactory.createProtein(dietPlan);
        Fats fat = fatsFactory.createFats(dietPlan);


        System.out.println("Carb: " + carb.getName() + " Protein: " + protein.getName() + " Fats: " + fat.getName());
    }
}
