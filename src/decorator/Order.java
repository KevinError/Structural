package decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> foodItemList;

    public Order() {
        this.foodItemList = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItemList.add(foodItem);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (FoodItem foodItem: foodItemList) {
            totalCost += foodItem.getCost();
        }

        return totalCost;
    }
}
