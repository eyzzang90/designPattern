package strategyPattern.duck.encapsulation;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
