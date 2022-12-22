package org.example.decoratorPattern.condiments;

import org.example.decoratorPattern.beverages.Beverage;

public abstract class Decorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    public abstract double cost();
}
