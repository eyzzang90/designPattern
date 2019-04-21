package observerPattern.weatherStation;

public interface Observer {

    /**
     * Oberver 인터페이스는 모든 옵저버 클래스에서 구현해야 한다. 따라서 모든 옵저버는 update() 메소드를 구현해야 한다.
     * 기상 정보가 변경되었을 때 옵저버한테 전달되는 상태 값들.
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature, float humidity, float pressure);
}
