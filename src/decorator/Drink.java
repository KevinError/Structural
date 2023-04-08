package decorator;

public class Drink implements FoodItem{
    private double basePrice;

    public Drink(double basePrice){
        this.basePrice = basePrice;
    }

    public double getCost(){
        return basePrice;
    }

}
