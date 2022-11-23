package org.example.strategyPattern.weaponGame.character;

public class Troll extends Character{

    @Override
    public void fight() {
        System.out.println("Troll is fighting with " + super.weaponBehavior.useWeapon());
    }

    public void display(){
        System.out.println("I am a troll");
    }
}
