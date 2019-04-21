package observerPattern.weatherStation;

public interface Subject {

    /**
     * 옵저버를 등록하는 역할
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 옵저버를 삭제하는 역할
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 주제 객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메소드
     */
    public void notifyObservers();

}
