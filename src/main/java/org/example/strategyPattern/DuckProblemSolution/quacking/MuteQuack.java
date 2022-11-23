package org.example.strategyPattern.DuckProblemSolution.quacking;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        //does not make any quack sound :)
        System.out.println("no sound at all(mute)");
    }
}
