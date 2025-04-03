public interface SubjectInterface {
    void registerObserver(WeatherDataObserver observer);

    void removeObserver(WeatherDataObserver observer);

    void notifyObservers();
}
