public class Player {
    private int hp;
    private int baseDamage;

    // --- Getter dan Setter ---
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    // Method untuk menyerang
    public void attack(Enemy enemy) {
        System.out.println("Player menyerang dengan " + this.baseDamage + " damage!");
        enemy.setHp(enemy.getHp() - baseDamage);
    }

    public boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }
}