package strategyPattern.robot;

public class Flying implements Moving{
    @Override
    public void move() {
        System.out.println("슝하고 날아간다");
    }
}
