package model;

import model.constant.Discount;

public abstract class Food implements Discountable{
    protected final int amount;
    protected final double price;
    public final boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getDiscount() {
        return Discount.DEFAULT;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double totalPrice() {
        return amount * price;
    }
}
