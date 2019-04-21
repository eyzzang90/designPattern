package strategyPattern.advantureGame.model;

import strategyPattern.advantureGame.encapsulation.WeaponBehavior;

public abstract class Charactor {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();

}
