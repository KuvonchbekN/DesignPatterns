package org.example.strategyPattern.weaponGame.character;

public class Knight extends Character {

    @Override
    public void fight() {
        System.out.println("Knight is fighting with " + super.weaponBehavior.useWeapon());
    }

    public void display(){
        System.out.println("I am a Knight");
    }
}
