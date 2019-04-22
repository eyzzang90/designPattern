package strategyPattern.robot;

public class Missile implements Attack {
    @Override
    public void attack() {
        System.out.println("미사일을 발사한다.");
    }
}
