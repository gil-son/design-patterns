package src.ex02;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");

        weatherData.addObserver(display1);
        weatherData.addObserver(display2);

        weatherData.setMeasurements(25.0f, 60.0f, 1013.0f); // Updates both displays
        weatherData.removeObserver(display1); // Removes one observer
        weatherData.setMeasurements(26.0f, 65.0f, 1014.0f); // Updates only display2
    }
}
