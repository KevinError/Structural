package decorator;

public class Fries implements FoodItem{
    private double basePrice;

    public Fries(double basePrice){
        this.basePrice = basePrice;
    }

    public double getCost(){
        return basePrice;
    }
}
