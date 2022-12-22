package org.example.decoratorPattern.beverages;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "Hot House Blend Coffe";
    }

    @Override
    public double cost() {
        return 1.7;
    }
}
