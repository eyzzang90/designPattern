package factoryMethodPattern.elevatorScheduling;

public interface ElevatorScheduler {

    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
