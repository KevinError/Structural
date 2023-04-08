package decorator;

public abstract class FoodDecorator implements FoodItem{
    private FoodItem foodItem;

    public FoodDecorator(FoodItem foodItem){
        this.foodItem = foodItem;
    }

    public double getCost(){
        return foodItem.getCost();

    }
}
