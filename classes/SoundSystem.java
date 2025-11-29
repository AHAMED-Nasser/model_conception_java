package classes;

import enums.EventType;
import interfaces.Observateur;

public class SoundSystem implements Observateur {
    @Override
    public void update(EventType eventType, double value) {
        if (eventType == EventType.HEALTH) {
            System.out.println("[classes.SoundSystem] bruit de dégât de chute");
        }

        if (eventType == EventType.XP) {
            System.out.println("[classes.SoundSystem] bruit de gain xp");
        }
    }
}
