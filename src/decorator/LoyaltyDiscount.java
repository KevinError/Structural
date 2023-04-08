package decorator;

public class LoyaltyDiscount {
    private int loyalty;

    public LoyaltyDiscount(int loyalty){
        this.loyalty = loyalty;
    }

    public double applyDiscount(double totalCost){
        double discountRate = 0;
        if (loyalty >= 100) {
            discountRate = 0.5;
        } else {
            discountRate = 1 - loyalty / 2 * 0.01;
        }

        return totalCost * discountRate;
    }
}
