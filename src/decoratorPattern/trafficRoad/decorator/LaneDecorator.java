package decoratorPattern.trafficRoad.decorator;

import decoratorPattern.trafficRoad.Display;

public class LaneDecorator extends DisplayDecorator {

    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();       //설정된 기존 표시 기능을 수행
        drawLane();         //추가적으로 차선을 표시
    }

    private void drawLane(){
        System.out.println("\t차선 표시");
    }

}