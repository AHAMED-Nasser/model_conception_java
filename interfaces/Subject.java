package interfaces;

public interface Subject {
    void registerObserver(Observervateur o);
    void removeObserver(Observervateur o);
    void notifyObservers(String eventType, double value);
}
