package factoryMethodPattern.elevatorScheduling;

import java.util.Calendar;

public class SchedulerFactory {

    // 각 스케줄러는 스케줄링을 하는 것에 2개 이상의 객체를 생성할 필요가 없으므로 인스턴스를 싱글톤 패턴을 적용해서 생성
    public static ElevatorScheduler getScheduler(SchedulingStrategyId strategyId){

        ElevatorScheduler scheduler = null;

        switch (strategyId){
            case RESPONSE_TIME:
                scheduler = ResponseTimeScheduler.getInstance();
                break;
            case THROUGHPUT:
                scheduler = ThroughtScheduler.getInstance();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                // 오전: 대기 시간 최소화, 오후: 처리량 최대화
                if(hour < 12)
                    scheduler = ResponseTimeScheduler.getInstance();
                else
                    scheduler = ThroughtScheduler.getInstance();
                break;
        }
        return scheduler;
    }
}
