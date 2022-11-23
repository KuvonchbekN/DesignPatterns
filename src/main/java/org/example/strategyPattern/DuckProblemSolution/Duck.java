package org.example.strategyPattern.DuckProblemSolution;

import org.example.strategyPattern.DuckProblemSolution.flying.FlyBehavior;
import org.example.strategyPattern.DuckProblemSolution.quacking.QuackBehavior;

public abstract class Duck  {

    QuackBehavior quackBehavior; //package private, we initialize it in the child class's constructor
    // or in the setter methods
    //look at the constructor of MallardDuck or setter method
    FlyBehavior flyBehavior;


    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("Swimming in the water!");
    }

}
