package org.example.strategyPattern.weaponGame.character;

import org.example.strategyPattern.weaponGame.strategy.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();

    abstract void display();
}
