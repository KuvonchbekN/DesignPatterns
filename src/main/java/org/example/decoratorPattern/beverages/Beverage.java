package org.example.decoratorPattern.beverages;

public abstract class Beverage {
    public String description = "Beverage Description";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

