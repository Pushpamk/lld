import java.util.*; 

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(float temp) {
        for (Observer observer : observers) {
            observer.update(temp);
        }
    }
}