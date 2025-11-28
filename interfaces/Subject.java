package interfaces;

public interface Subject {
    void registerObserver(Observateur o);
    void removeObserver(Observateur o);
    void notifyObservers(String eventType, double value);
}
