import displays.display.ConditionsDisplay;

public class Application {
    public static void main(String[] args) {
        MeteoData meteoData = new MeteoData();

        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(meteoData);

        meteoData.setMeasurement(10, 20, 30);
        meteoData.setMeasurement(40, 50, 60);
        meteoData.setMeasurement(70, 80, 100);
    }
}
