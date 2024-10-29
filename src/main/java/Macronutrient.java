import java.util.Random;

class Macronutrient {
    abstract static class CarbsFactory{
        abstract Carbs createCarb(String dietPlan);
    }
    static class CarbsNoRestriction extends CarbsFactory{
        public final Carbs[] carbs = {
                new Cheese(),
                new Bread(),
                new Lentils(),
                new Pistachio()
        };
        public final Random random = new Random();
        @Override
        Carbs createCarb(String dietPlan){
            return carbs[random.nextInt(carbs.length)];
        }
    }
    static class CarbsPaleo extends CarbsFactory{
        public final Carbs[] carbs = {
                new Pistachio()
        };
        public final Random random = new Random();
        @Override
        Carbs createCarb(String dietPlan){
            return carbs[random.nextInt(carbs.length)];
        }
    }
    static class CarbsVegan extends CarbsFactory{
        public final Carbs[] carbs = {
                new Cheese(),
                new Bread(),
                new Lentils(),
                new Pistachio()
        };
        public final Random random = new Random();
        @Override
        Carbs createCarb(String dietPlan){
            return carbs[random.nextInt(carbs.length)];
        }
    }
    static class CarbsNutAllergy extends CarbsFactory{
        public final Carbs[] carbs = {
                new Cheese(),
                new Bread(),
                new Lentils()
        };
        public final Random random = new Random();
        @Override
        Carbs createCarb(String dietPlan){
            return carbs[random.nextInt(carbs.length)];
        }
    }
    public CarbsFactory getCarbsFactory(String dietPlan){
        switch (dietPlan){
            case "Paleo":
                return new CarbsPaleo();
            case "Vegan":
                return new CarbsVegan();
            case "NutAllergy":
                return new CarbsNutAllergy();
            default:
                return new CarbsNoRestriction();

        }
    }
    abstract static class ProteinFactory{
        abstract Proteins createProtein(String dietPlan);

        static class ProteinNoRestriction extends ProteinFactory{
            public final Proteins[] proteins = {
                    new Fish(),
                    new Chicken(),
                    new Beef(),
                    new Tofu()
            };
            public final Random random = new Random();
            @Override
            Proteins createProtein(String dietPlan){
                return proteins[random.nextInt(proteins.length)];
            }
        }
        static class ProteinPaleo extends ProteinFactory{
            public final Proteins[] proteins = {
                    new Fish(),
                    new Chicken(),
                    new Beef()
            };
            public final Random random = new Random();
            @Override
            Proteins createProtein(String dietPlan){
                return proteins[random.nextInt(proteins.length)];
            }
        }
        static class ProteinVegan extends ProteinFactory{
            public final Proteins[] proteins = {
                    new Tofu()
            };
            public final Random random = new Random();
            @Override
            Proteins createProtein(String dietPlan){
                return proteins[random.nextInt(proteins.length)];
            }
        }
        static class ProteinNutAllergy extends ProteinFactory{
            public final Proteins[] proteins = {
                    new Fish(),
                    new Chicken(),
                    new Beef(),
                    new Tofu()
            };
            public final Random random = new Random();
            @Override
            Proteins createProtein(String dietPlan){
                return proteins[random.nextInt(proteins.length)];
            }
        }
    }
    public ProteinFactory getProteinFactory(String dietPlan){
        switch (dietPlan){
            case "Paleo":
                return new ProteinFactory.ProteinPaleo();
            case "Vegan":
                return new ProteinFactory.ProteinVegan();
            case "NutAllergy":
                return new ProteinFactory.ProteinNutAllergy();
            default:
                return new ProteinFactory.ProteinNoRestriction();

        }
    }
    abstract static class FatsFactory{
        abstract Fats createFats(String dietPlan);

        static class FatsNoRestriction extends FatsFactory{
            public final Fats[] fats = {
                    new Avocado(),
                    new SourCream(),
                    new Tuna(),
                    new Peanuts()
            };
            public final Random random = new Random();
            @Override
            Fats createFats(String dietPlan){
                return fats[random.nextInt(fats.length)];
            }
        }
        static class FatsPaleo extends FatsFactory{
            public final Fats[] fats = {
                    new Avocado(),
                    new Tuna(),
                    new Peanuts()
            };
            public final Random random = new Random();
            @Override
            Fats createFats(String dietPlan){
                return fats[random.nextInt(fats.length)];
            }
        }
        static class FatsVegan extends FatsFactory{
            public final Fats[] fats = {
                    new Avocado(),
                    new Peanuts()
            };
            public final Random random = new Random();
            @Override
            Fats createFats(String dietPlan){
                return fats[random.nextInt(fats.length)];
            }
        }
        static class FatsNutAllergy extends FatsFactory{
            public final Fats[] fats = {
                    new Avocado(),
                    new SourCream(),
                    new Tuna()
            };
            public final Random random = new Random();
            @Override
            Fats createFats(String dietPlan){
                return fats[random.nextInt(fats.length)];
            }
        }
    }
    public FatsFactory getFatsFactory(String dietPlan){
        switch (dietPlan){
            case "Paleo":
                return new FatsFactory.FatsPaleo();
            case "Vegan":
                return new FatsFactory.FatsVegan();
            case "NutAllergy":
                return new FatsFactory.FatsNutAllergy();
            default:
                return new FatsFactory.FatsNoRestriction();

        }
    }
}