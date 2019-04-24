package factoryMethodPattern.elevatorScheduling;

import java.util.Calendar;
import java.util.List;

public class ElevatorManager {

    private List<ElevatorController> controllers;
    private SchedulingStrategyId strategyId;

    // 주어진 수만큼의 ElevatorController 를 생성한다.
    public ElevatorManager(int controllerCount) {
        for(int i=0; i<controllerCount; i++){
            ElevatorController controller = new ElevatorController(i+1);
            controllers.add(controller);
        }
    }

    // 실행 중에 다른 스케줄링 전략으로 지정 가능
    public void setStrategyId(SchedulingStrategyId strategyId){
        this.strategyId = strategyId;
    }

    // 요청에 따라 엘리베이터를 선택하고 이동시킴
    public void requestElevator(int destination, Direction direction){

        // 주어진 전략 ID에 해당되는 ElevatorScheduler를 사용한다(변경)
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyId);
        System.out.println(scheduler);

        // 주어진 전략에 따라 엘리베이터를 선택함
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);

    }
}
