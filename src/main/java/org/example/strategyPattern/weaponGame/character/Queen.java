package org.example.strategyPattern.weaponGame.character;

public class Queen extends Character{

    @Override
    public void fight() {
        System.out.println("Queen is fighting with " + super.weaponBehavior.useWeapon());
    }

    public void display(){
        System.out.println("I am a queen");
    }
}
