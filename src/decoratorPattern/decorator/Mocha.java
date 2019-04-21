package decoratorPattern.decorator;

import decoratorPattern.Beverage;
import decoratorPattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;  //감싸고자 하는 음료를 저장하기 위한 인스턴스 변수

    public Mocha(Beverage beverage) {       //인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 생성자.
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
