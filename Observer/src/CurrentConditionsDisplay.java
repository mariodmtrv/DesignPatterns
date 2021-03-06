/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/8/14
 * Time: 12:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
      System.out.println("The current conditions "+temperature+" "+humidity);
    }
}
