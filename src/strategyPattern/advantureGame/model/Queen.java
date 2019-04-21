package strategyPattern.advantureGame.model;

import strategyPattern.advantureGame.encapsulation.BowAndArrowBehavior;

public class Queen extends Charactor {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
        System.out.println("연약하지만 강하게 싸운다");
    }
}
