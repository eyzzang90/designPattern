package factoryMethodPattern.elevatorScheduling;

public class ThroughtScheduler implements ElevatorScheduler {

    private static ElevatorScheduler scheduler;
    private ThroughtScheduler() { }

    // 정적 메서드로 객체 생성 구현(싱글톤)
    public static ElevatorScheduler getInstance(){
        if(scheduler == null){
            scheduler = new ThroughtScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;   //임의로 선택함
    }
}
