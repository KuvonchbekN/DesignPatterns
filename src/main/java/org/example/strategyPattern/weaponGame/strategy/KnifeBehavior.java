package org.example.strategyPattern.weaponGame.strategy;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return cut();
    }

    public String cut(){
        return "cutting using the knife";
    }

}
