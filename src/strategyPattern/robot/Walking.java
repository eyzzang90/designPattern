package strategyPattern.robot;

public class Walking implements Moving{
    @Override
    public void move() {
        System.out.println("뚜벅 뚜벅 걸어간다");
    }
}
