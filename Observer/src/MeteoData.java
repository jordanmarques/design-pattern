import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class MeteoData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public MeteoData() {
        observers = new ArrayList<>();
    }


    @Override
    public void saveObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.refresh(temperature, humidity, pressure));
    }

    public void refreshMeasurement(){
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        refreshMeasurement();
    }
}
