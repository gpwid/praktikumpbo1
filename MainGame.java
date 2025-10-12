import java.util.Random;

public class MainGame {
    public static void main(String[] args) {
        boolean gameState = true;
        Random rand = new Random();

        // Membuat objek Player
        Player hero = new Player();
        hero.setHp(100);
        hero.setBaseDamage(20);

        // Membuat objek Goblin (turunan dari Enemy)
        Goblin goblin = new Goblin();
        goblin.setHp(50);
        goblin.setBaseDamage(10);

        System.out.println("--- Pertarungan Dimulai! ---");

        do {
            System.out.println("Player HP: " + hero.getHp() + " | Goblin HP: " + goblin.getHp());
            System.out.println("----------------------------\n");

            // If-statement cek status pemain
            if (hero.isAlive() && !goblin.isAlive()) {
                System.out.println("Hero menang!");
                gameState = false;
                break;
            } else if (!hero.isAlive()) {
                System.out.println("Hero kalah!");
                System.out.println("--- GAME OVER! ---");
                gameState = false;
                break;
            }

            // RNG untuk menyerang
            int dice = rand.nextInt(6);
            if (dice > 2) {
                hero.attack(goblin);
            } else {
                goblin.attack(hero);
            }
        } while (gameState);


        System.out.println("\n--- Pertarungan Selesai ---");
    }
}