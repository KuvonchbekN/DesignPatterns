package org.example.strategyPattern.weaponGame.strategy;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public String useWeapon() {
        return chop();
    }

    public String chop(){
        return "chopping with axe";
    }
}
