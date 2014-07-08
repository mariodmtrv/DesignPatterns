import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/7/14
 * Time: 11:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private double temperature;
    private double humidity;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    public void update() {

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int index = 0; index < observers.size(); index++) {
            Observer observer = (Observer) observers.get(index);
            observer.update(temperature, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void getTemperature() {
    }

    public void getHumidity() {

    }

    public void setMeasurements(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }


}
