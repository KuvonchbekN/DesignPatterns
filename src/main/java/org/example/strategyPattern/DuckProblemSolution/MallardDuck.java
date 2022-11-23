package org.example.strategyPattern.DuckProblemSolution;

public class MallardDuck extends Duck{

    public MallardDuck() {
        //we can do it this way but it would not be dynamic :(, so we gonna use setter in the parent
//        quackBehavior = new QuackWithSound();
//        flyBehavior = new FlyWithWings();
    }


    public void display(){
        System.out.println("I am a real MallardDuck");
    }

//
}
