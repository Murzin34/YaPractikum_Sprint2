package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public Food[] getItems() {
        return items;
    }

    public double getTotalPrice() {
        double sum = 0.0;
        for (Food item : getItems()) {
            sum += item.totalPrice();
        }
        return sum;
    }

    public double getDiscountPrice() {
        double sum = 0.0;
        for (Food item : getItems()) {
            double discount = (100 - item.getDiscount()) / 100;
            sum += item.totalPrice() * discount;
        }
        return sum;
    }

    public double getVegetarianPrice() {
        double sum = 0.0;
        for (Food item : getItems()) {
            if (item.isVegetarian()) {
                sum += item.totalPrice();
            }
        }
        return sum;
    }
}
