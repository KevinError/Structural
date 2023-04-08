import decorator.*;

public class DecoratorMain {

    public static void main(String[] args){
        Order firstOrder = new Order();
        LoyaltyDiscount firstDiscount = new LoyaltyDiscount(199);
        Order secondOrder = new Order();
        LoyaltyDiscount secondDiscount = new LoyaltyDiscount(50);
        Order thirdOrder = new Order();
        LoyaltyDiscount thirdDiscount = new LoyaltyDiscount(20);

        FoodItem burger = new Burger(5.0);
        FoodItem drink = new Drink(1.5);
        FoodItem fries = new Fries(2);

        firstOrder.addFoodItem(new Bacon(burger));
        firstOrder.addFoodItem(drink);
        firstOrder.addFoodItem(fries);
        System.out.println("Original Total price: " + firstOrder.calculateTotalCost());
        System.out.println("Discounted Price: " + firstDiscount.applyDiscount(firstOrder.calculateTotalCost()));

        secondOrder.addFoodItem(new Bacon(new Cheese(burger)));
        secondOrder.addFoodItem(drink);
        System.out.println("Original Total price: " + secondOrder.calculateTotalCost());
        System.out.println("Discounted Price: " + secondDiscount.applyDiscount(secondOrder.calculateTotalCost()));

        thirdOrder.addFoodItem(burger);
        thirdOrder.addFoodItem(fries);
        System.out.println("Original Total price: " + thirdOrder.calculateTotalCost());
        System.out.println("Discounted Price: " + thirdDiscount.applyDiscount(thirdOrder.calculateTotalCost()));


    }
}
