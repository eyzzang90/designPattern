package decoratorPattern.decorator;

import decoratorPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();    //모든 첨가물 데코레이터에서 새로 getDescription 을 새로 구현하도록 만들 계획임.

    //public abstract String getSize();
}
