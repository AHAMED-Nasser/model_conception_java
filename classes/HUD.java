package classes;

import enums.EventType;
import interfaces.Observateur;


public class HUD implements Observateur {
    @Override
    public void update(EventType eventType, double value) {
        if (eventType == EventType.HEALTH) {
            System.out.println("[classes.HUD] Point de vie mise à jour : " + value);
        }

        if (eventType == EventType.XP) {
            System.out.println(("[classes.HUD] XP mise à jour : +" + value));
        }
    }
}
