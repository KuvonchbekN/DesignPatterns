package org.example;

import org.example.decoratorPattern.beverages.Beverage;
import org.example.decoratorPattern.beverages.Espresso;
import org.example.decoratorPattern.condiments.Decorator;
import org.example.decoratorPattern.condiments.Mocha;
import org.example.observerPattern.CurrentConditionsDisplay;
import org.example.observerPattern.DisplayElement;
import org.example.observerPattern.Subject;
import org.example.observerPattern.WeatherData;
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
        /*Character character = new King();
        character.setWeaponBehavior(new KnifeBehavior());
        character.fight();
*/


        Beverage espresso = new Espresso();
        Decorator mocha = new Mocha(espresso);
        System.out.println(mocha.cost());
        System.out.println(mocha.getDescription());






    }
}