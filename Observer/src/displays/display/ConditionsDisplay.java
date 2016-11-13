package displays.display;

import displays.Display;
import interfaces.Observer;
import interfaces.Subject;

public class ConditionsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Subject meteoData;

    public ConditionsDisplay(Subject meteoData) {
        this.meteoData = meteoData;
        meteoData.saveObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Actual conditions are: " +
                temperature + "C° " +
                humidity + "% humidity"
        );
    }

    @Override
    public void refresh(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
