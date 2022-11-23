package org.example.strategyPattern.DuckProblemSolution.quacking;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        //only make squeak sound // e.g toy ducks make squeak sounds:)

        System.out.println("Squeak sound");
    }
}
