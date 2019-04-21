package observerPattern.weatherStation.simulator;

import observerPattern.weatherStation.CurrentConditionsDisplay;
import observerPattern.weatherStation.HeatIndexDisplay;
import observerPattern.weatherStation.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 47, 40.1f);

    }
}
