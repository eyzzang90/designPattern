package strategyPattern.duck.simulator;

import strategyPattern.duck.encapsulation.FlyRocketPowered;
import strategyPattern.duck.model.Duck;
import strategyPattern.duck.model.MallardDuck;
import strategyPattern.duck.model.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        System.out.println("-----청둥오리 테스트---------");
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        System.out.println("-----모형오리 테스트---------");
        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
