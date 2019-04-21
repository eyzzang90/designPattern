package strategyPattern.advantureGame.encapsulation;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼로 샤샤샤샤샥");
    }
}
