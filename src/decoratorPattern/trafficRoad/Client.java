package decoratorPattern.trafficRoad;

import decoratorPattern.trafficRoad.decorator.LaneDecorator;
import decoratorPattern.trafficRoad.decorator.TrafficDecorator;

public class Client {

    public static void main(String[] args) {

        //기본 도로 표시
        Display road = new RoadDisplay();
        road.draw();

        //기본 도로 표시 + 차선 표시
        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        //기본 도로 표시 + 교통량 표시
        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        //기본 도로 표시 + 차선 표시 + 교통량 표시
        Display roadWithLandAndTraffic1 = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLandAndTraffic1.draw();

        Display roadWithLandAndTraffic2 = new RoadDisplay();
        roadWithLandAndTraffic2 = new LaneDecorator(roadWithLandAndTraffic2);
        roadWithLandAndTraffic2 = new TrafficDecorator(roadWithLandAndTraffic2);
        roadWithLandAndTraffic2.draw();

    }
}
