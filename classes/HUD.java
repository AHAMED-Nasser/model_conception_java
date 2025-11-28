public class HUD implements Observer{
    @Override
    public void update(String eventType, double value) {
        if (eventType.equals("HEALTH")) {
            System.out.println("[HUD] Point de vie mise à jour : " + value);
        }

        if (eventType.equals("XP")) {
            System.out.println(("[HUD] XP mise à jour : " + value));
        }
    }
}
