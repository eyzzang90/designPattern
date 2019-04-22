package strategyPattern.robot;

public class Punch implements Attack {
    @Override
    public void attack() {
        System.out.println("펀치를 강하게 날린다");
    }
}
