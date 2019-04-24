package factoryMethodPattern.elevatorScheduling;

public class Client {

    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyId.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughtputScheduler = new ElevatorManager(2, SchedulingStrategyId.THROUGHPUT);
        emWithThroughtputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyId.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
