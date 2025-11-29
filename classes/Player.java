package classes;

import interfaces.Observateur;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Player implements Subject {

    private List<Observateur> observers = new ArrayList<>();

    private int health;
    private double xp;

    public void registerObserver(Observateur o) {
        observers.add(o);
    }

    public void removeObserver(Observateur o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String eventType, double value) {
        for (Observateur o : observers) {
            o.update(eventType, value);
        }
    }

    // Methods that changes the stat

    public void setHealth(int health) {
        this.health = health;
        notifyObservers("HEALTH", health);
    }

    public void setXP(double xp) {
        this.xp += xp;
        notifyObservers("XP", xp);
    }
}
