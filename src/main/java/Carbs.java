abstract class Carbs{
    abstract String getName();
}
class Cheese extends Carbs{
    @Override
    String getName(){
        return "Cheese";
    }
}
class Bread extends Carbs{
    @Override
    String getName(){
        return "Bread";
    }
}
class Lentils extends Carbs{
    @Override
    String getName(){
        return "Lentils";
    }
}
class Pistachio extends Carbs{
    @Override
    String getName(){
        return "Pistachio";
    }
}