package factoryMethodPattern.elevatorScheduling;

public class ResponseTimeScheduler implements ElevatorScheduler{

    private static ElevatorScheduler scheduler;
    private ResponseTimeScheduler() {}

    // 정적 메서드로 객체 생성 구현(싱글톤)
    public static ElevatorScheduler getInstance(){
        if(scheduler == null){
            scheduler = new ResponseTimeScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 1;   // 임의로 선택함
    }
}
