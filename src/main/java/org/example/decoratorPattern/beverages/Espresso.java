package org.example.decoratorPattern.beverages;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Hot Espresso Drink";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
