import classes.HUD;
import classes.Player;
import classes.SoundSystem;

public class MinecraftGame {
    public static void main(String[] args) {
        Player steve = new Player();

        HUD mainHud = new HUD();
        SoundSystem son = new SoundSystem();

        steve.registerObserver(mainHud);
        steve.registerObserver(son);

        System.out.println("--- Début de la partie ---");

        // Steve prend des dégâts de chute
        System.out.println("\n Steve tombe de haut");
        steve.setHealth(2);

        // Steve gagne de l'expériences
        System.out.println("\n Steve mine du charbon de haut");
        steve.setXP(0.90);
    }
}
