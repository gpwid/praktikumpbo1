import java.util.Random;

public class Goblin extends Enemy {
    // Override method attack() dari superclass Enemy
    @Override
    public void attack(Player player) {
        Random rand = new Random();
        // Menghasilkan angka acak antara 0 hingga 99
        int chance = rand.nextInt(100);

        // 5% kemungkinan (jika angka acak < 5)
        if (chance < 5) {
            int doubleDamage = getBaseDamage() * 2;
            System.out.println("Goblin melancarkan serangan kritis! Memberikan " + doubleDamage + " damage!");
            player.setHp(player.getHp() - doubleDamage);
        } else { // 95% kemungkinan
            System.out.println("Goblin menyerang! Memberikan " + getBaseDamage() + " damage.");
            player.setHp(player.getHp() - getBaseDamage());
        }
    }
}