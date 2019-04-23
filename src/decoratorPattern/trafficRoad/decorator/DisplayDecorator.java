package decoratorPattern.trafficRoad.decorator;

import decoratorPattern.trafficRoad.Display;

/**
 * 다양한 추가 기능에 대한 공통 클래스
 */
public class DisplayDecorator extends Display {

    private Display decoratedDisplay;

    // 합성(Composition) 관계를 통해 RoadDisplay 객체에 대한 참조조
   public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
