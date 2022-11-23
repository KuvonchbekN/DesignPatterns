package org.example.strategyPattern.weaponGame.character;

public class King extends Character{

    @Override
    public void fight() {
        System.out.println("King is fighting with " + super.weaponBehavior.useWeapon());
    }

    public void display(){
        System.out.println("I am a king");
    }


}
