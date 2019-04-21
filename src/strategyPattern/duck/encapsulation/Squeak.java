package strategyPattern.duck.encapsulation;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삑");
    }
}
