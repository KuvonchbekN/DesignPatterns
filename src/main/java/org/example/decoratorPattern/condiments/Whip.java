package org.example.decoratorPattern.condiments;

import org.example.decoratorPattern.beverages.Beverage;

public class Whip extends Decorator {

    public Whip(Beverage beverage ) {
        description = "Whip condiment";
        super.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,with " + super.description;
    }

    @Override
    public double cost() {
        return beverage.cost() + .3;
    }


}
