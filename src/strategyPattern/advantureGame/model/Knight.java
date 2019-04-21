package strategyPattern.advantureGame.model;

import strategyPattern.advantureGame.encapsulation.KnifeBehavior;

public class Knight extends Charactor {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
        System.out.println("패기 넘치게 싸웁니다.");
    }
}
