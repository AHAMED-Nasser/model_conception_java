package classes;

import interfaces.Observervateur;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Player implements Subject {

    private List<Observervateur> observers = new ArrayList<>();

    private int health;
    private double xp;

    public void registerObserver(Observervateur o) {
        observers.add(o);
    }

    public void removeObserver(Observervateur o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String eventType, double value) {
        for (Observervateur o : observers) {
            o.update(eventType, value);
        }
    }

    // Methods that changes the stat

    public void setHealth(int health) {
        this.health = health;
        notifyObservers("HEALTH", health);
    }

    public void setXP(double xp) {
        this.xp = xp;
        notifyObservers("XP", xp);
    }
}
