package decoratorPattern.trafficRoad.decorator;

import decoratorPattern.trafficRoad.Display;

public class CrossingDecorator extends DisplayDecorator {

    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawingCrossing();
    }

    private void drawingCrossing(){
        System.out.println("\t교차로 표시");
    }
}
