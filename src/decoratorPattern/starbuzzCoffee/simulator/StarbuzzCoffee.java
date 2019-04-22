package decoratorPattern.starbuzzCoffee.simulator;

import decoratorPattern.starbuzzCoffee.Beverage;
import decoratorPattern.starbuzzCoffee.DarkRoast;
import decoratorPattern.starbuzzCoffee.Espresso;
import decoratorPattern.starbuzzCoffee.HouseBlend;
import decoratorPattern.starbuzzCoffee.decorator.Mocha;
import decoratorPattern.starbuzzCoffee.decorator.Soy;
import decoratorPattern.starbuzzCoffee.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.VENTI);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());


        Beverage beverage4 = new HouseBlend();
        beverage4.setSize(Beverage.TALL);
        beverage4 = new Whip(new Mocha(new Soy(beverage4)));
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
    }
}
