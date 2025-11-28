package classes;

import interfaces.Observateur;


public class HUD implements Observateur {
    @Override
    public void update(String eventType, double value) {
        if (eventType.equals("HEALTH")) {
            System.out.println("[classes.HUD] Point de vie mise à jour : " + value);
        }

        if (eventType.equals("XP")) {
            System.out.println(("[classes.HUD] XP mise à jour : " + value));
        }
    }
}
