abstract class Fats{
    abstract String getName();
}
class Avocado extends Fats{
    @Override
    String getName(){
        return "Avocado";
    }
}
class SourCream extends Fats{
    @Override
    String getName(){
        return "Sour Cream";
    }
}
class Tuna extends Fats{
    @Override
    String getName(){
        return "Tuna";
    }
}
class Peanuts extends Fats{
    @Override
    String getName(){
        return "Peanuts";
    }
}