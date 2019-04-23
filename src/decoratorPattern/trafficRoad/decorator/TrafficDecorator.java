package decoratorPattern.trafficRoad.decorator;

import decoratorPattern.trafficRoad.Display;

public class TrafficDecorator extends DisplayDecorator {

    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();       //설정된 기존 표시 기능을 수행
        drawTraffic();      //추가적으로 교통량을 표시
    }

    private void drawTraffic(){
        System.out.println("\t교통량 표시");
    }
}
