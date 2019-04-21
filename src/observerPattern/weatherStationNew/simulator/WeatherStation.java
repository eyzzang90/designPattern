package observerPattern.weatherStationNew.simulator;

import observerPattern.weatherStationNew.CurrentConditionsDisplay;
import observerPattern.weatherStationNew.WeatherData;
import observerPattern.weatherStationNew.ForecastDisplay;

import java.util.Observable;

public class WeatherStation {

    public static void main(String[] args) {

        Observable weatherData = new WeatherData();


        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        ((WeatherData) weatherData).setMeasurements(90, 22, 44);

    }
}
