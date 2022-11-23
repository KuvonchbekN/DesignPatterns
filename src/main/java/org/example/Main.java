package org.example;

import org.example.strategyPattern.DuckProblemSolution.Duck;
import org.example.strategyPattern.DuckProblemSolution.MallardDuck;
import org.example.strategyPattern.DuckProblemSolution.flying.FlyWithWings;
import org.example.strategyPattern.DuckProblemSolution.quacking.QuackWithSound;
import org.example.strategyPattern.weaponGame.character.Character;
import org.example.strategyPattern.weaponGame.character.King;
import org.example.strategyPattern.weaponGame.strategy.KnifeBehavior;

public class Main {
    public static void main(String[] args) {

        /* Testing duck problem
        Duck duck = new MallardDuck();
        duck.setQuackBehavior(new QuackWithSound());//we did this dynamic :)
        duck.setFlyBehavior(new FlyWithWings());//we did this dynamic :)
        duck.performFly();
        duck.performQuack();
        */

        //Testing the weapon game
        Character character = new King();
        character.setWeaponBehavior(new KnifeBehavior());
        character.fight();




    }
}