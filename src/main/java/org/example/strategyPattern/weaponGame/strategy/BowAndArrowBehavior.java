package org.example.strategyPattern.weaponGame.strategy;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public String useWeapon() {
        return shoot();
    }

    public String shoot(){
        return "Shooting an arrow with bow";
    }
}
