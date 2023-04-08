package decorator;

public class Bacon extends FoodDecorator{
    private double cost;

    public Bacon(FoodItem foodItem){
        super(foodItem);
        this.cost = 2;
    }

    public double getCost(){
        return super.getCost() + cost;
    }
}
