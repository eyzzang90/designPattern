package strategyPattern.advantureGame.encapsulation;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("화살을 미간에 꼬자주지");
    }
}
