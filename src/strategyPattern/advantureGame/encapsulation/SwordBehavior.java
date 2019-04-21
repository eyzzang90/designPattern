package strategyPattern.advantureGame.encapsulation;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("칼로 슈슈슈슈슛ㄱ");
    }
}
