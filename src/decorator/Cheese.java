package decorator;

public class Cheese extends FoodDecorator {
    private double cost;

    public Cheese(FoodItem foodItem){
        super(foodItem);
        this.cost = 0.25;
    }

    public double getCost(){
        return super.getCost() + cost;
    }
}
