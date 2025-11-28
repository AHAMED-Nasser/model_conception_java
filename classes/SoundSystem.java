public class SoundSystem implements Observer{
    @Override
    public void update(String eventType, double value) {
        if (eventType.equals("HEALTH")) {
            System.out.println("[SoundSystem] bruit de dégât de chute");
        }

        if (eventType.equals("XP")) {
            System.out.println("[SoundSystem] bruit de gain xp");
        }
    }
}
