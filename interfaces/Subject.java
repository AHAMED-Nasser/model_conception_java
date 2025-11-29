package interfaces;

import enums.EventType;

public interface Subject {
    void registerObserver(Observateur o);
    void removeObserver(Observateur o);
    void notifyObservers(EventType eventType, double value);
}
