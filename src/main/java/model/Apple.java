package model;

import model.constant.Colour;
import model.constant.Discount;

import java.util.Objects;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(getColour(), Colour.RED)) {
            return Discount.RED;
        }
        return Discount.DEFAULT;
    }
}
