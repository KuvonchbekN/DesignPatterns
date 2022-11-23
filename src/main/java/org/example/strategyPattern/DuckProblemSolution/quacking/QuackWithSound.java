package org.example.strategyPattern.DuckProblemSolution.quacking;

public class QuackWithSound implements QuackBehavior {
    @Override
    public void quack() {
        //actually quack sound
        System.out.println("quack quack sound");
    }
}
