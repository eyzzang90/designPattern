package observerPattern.weatherStationNew;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();          // 객체를 보내지 않는 경우: pull 모델         notifyObservers(Object args) : push 모델
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //옵저버가 pull 방식으로 주제(WeatherData)에 대한 객체의 상태를 알아내기 위해서는 getter가 필요하다.

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
