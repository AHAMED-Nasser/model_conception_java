package classes;

import interfaces.Observateur;

public class SoundSystem implements Observateur {
    @Override
    public void update(String eventType, double value) {
        if (eventType.equals("HEALTH")) {
            System.out.println("[classes.SoundSystem] bruit de dégât de chute");
        }

        if (eventType.equals("XP")) {
            System.out.println("[classes.SoundSystem] bruit de gain xp");
        }
    }
}
