package strategyPattern.advantureGame.model;

import strategyPattern.advantureGame.encapsulation.AxeBehavior;
import strategyPattern.advantureGame.encapsulation.SwordBehavior;

public class King extends Charactor{

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
        System.out.println("엄청 근엄 진지하게 싸웁니다.");
    }
}
