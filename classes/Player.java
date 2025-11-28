import java.util.ArrayList;
import java.util.List;

public class Player implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private int health;
    private double xp;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String eventType, double value) {
        for (Observer o : observers) {
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
