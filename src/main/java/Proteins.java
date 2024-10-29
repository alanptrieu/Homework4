abstract class Proteins{
    abstract String getName();
}
class Fish extends Proteins{
    @Override
    String getName(){
        return "Fish";
    }
}
class Chicken extends Proteins{
    @Override
    String getName(){
        return "Chicken";
    }
}
class Beef extends Proteins{
    @Override
    String getName(){
        return "Beef";
    }
}
class Tofu extends Proteins{
    @Override
    String getName(){
        return "Tofu";
    }
}