
public class Character {
    private String name;
    private int health;
    private int strength;
    private int defense;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void attack(Character opponent) {
        int damage = Math.max(0, (this.strength - opponent.defense) + (int)(Math.random() * 6));
        System.out.println(this.name + " attacks " + opponent.getName() + " for " + damage + " damage.");
        opponent.takeDamage(damage);
    }

    public String toString() {
        return this.name + " (HP: " + this.health + ")";
    }
}
