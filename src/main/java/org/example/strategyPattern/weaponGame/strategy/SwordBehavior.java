package org.example.strategyPattern.weaponGame.strategy;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public String useWeapon() {
        return swing();
    }

    public String swing(){
        return "Swinging a sword";
    }
}
