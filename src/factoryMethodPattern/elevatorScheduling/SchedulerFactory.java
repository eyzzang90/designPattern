package factoryMethodPattern.elevatorScheduling;

import java.util.Calendar;

public class SchedulerFactory {

    public static ElevatorScheduler getScheduler(SchedulingStrategyId strategyId){

        ElevatorScheduler scheduler = null;

        switch (strategyId){
            case RESPONSE_TIME:
                scheduler = new ResponseTimeScheduler();
                break;
            case THROUGHPUT:
                scheduler = new ThroughtScheduler();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                // 오전: 대기 시간 최소화, 오후: 처리량 최대화
                if(hour < 12)
                    scheduler = new ResponseTimeScheduler();
                else
                    scheduler = new ThroughtScheduler();
                break;
        }
        return scheduler;
    }
}
