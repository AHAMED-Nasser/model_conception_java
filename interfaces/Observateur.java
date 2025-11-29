package interfaces;

import enums.EventType;

public interface Observateur {
    void update(EventType eventType, double value);
}

