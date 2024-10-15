public class Character {
    //base
    public String name;
    public int health;
    public int strength;
    public int defense;
    
    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }
    
    public int attack(Character target) {
        int damage = this.strength - target.getDefense();
        damage = Math.max(0, damage);  // Prevent negative damage
        target.takeDamage(damage);
        System.out.println(this.name + " attacked " + target.getName() + " for " + damage + " damage.");
        return damage; // Return the damage dealt
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        return this.health;  // Return the current health after damage
    }

    // Returns true if the character is still alive, false otherwise
    public boolean isAlive() {
        return this.health > 0;
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDefense() {
        return this.defense;
    }
}