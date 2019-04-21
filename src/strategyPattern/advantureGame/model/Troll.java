package strategyPattern.advantureGame.model;

import strategyPattern.advantureGame.encapsulation.AxeBehavior;

public class Troll extends Charactor{

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
        System.out.println("얍삽하게 싸운다.");
    }
}
