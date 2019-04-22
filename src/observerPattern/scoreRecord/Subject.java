package observerPattern.scoreRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상화된 변경 관심 대상 데이터
 * 즉, 데이터에 공통적으로 들어가야 하는 메서드들 --> 일반화
 */
public abstract class Subject {

    // 추상화된 통보 대상 목록
    private List<Observer> observers = new ArrayList<>();

    //등록(추가), 삭제(제거), 알림(통보)
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }


}
