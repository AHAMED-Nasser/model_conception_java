package classes;

import interfaces.Observervateur;


public class HUD implements Observervateur {
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
