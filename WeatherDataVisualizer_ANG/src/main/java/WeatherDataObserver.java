import javafx.scene.Parent;

public interface WeatherDataObserver {

    Parent getRoot();

    void updateWeatherVisualization(WeatherData currentWeather);
}
