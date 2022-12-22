package org.example.decoratorPattern.condiments;

import org.example.decoratorPattern.beverages.Beverage;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage ) {
        description = "Mocha condiment";
        super.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,with " + super.description;
    }

    @Override
    public double cost() {
        return beverage.cost() + .2;
    }


}
