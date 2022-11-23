package org.example.strategyPattern.DuckProblemSolution.flying;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {

    }

    private void cannotFly(){//e.g toy ducks
        System.out.println("sorry cannot fly");
    }
}
