/**
 * Observer - defines a one-to-many dependency so that
 * when one subject changes state, all its dependents are notified.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(34.7f, 65);
    }
}
