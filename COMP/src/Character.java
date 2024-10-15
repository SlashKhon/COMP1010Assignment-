import java.util.ArrayList;
import java.util.List;

public class Character {
<<<<<<< HEAD
    // Base attributes
    public String name;
    public int health;
    public int strength;
    public int defense;
    public List<Character> allies; // List to hold allies

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.allies = new ArrayList<>(); // Initialize the allies list
    }

    public int attack(Character target) {
        int damage = this.strength - target.getDefense();
        damage = Math.max(0, damage); // Prevent negative damage
        target.takeDamage(damage);

        // Use the damage variable effectively
        System.out.println(this.name + " attacked " + target.getName() + " for " + damage + " damage.");
        return damage; // Return the damage dealt
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        return this.health; // Return the current health after damage
=======
    //base 
    String name;
    int health; 
    int maxHealthPoints;
    
    //Character stats
    int strength; 
    int defence; 
    int intelligence; 
    int initiative;   //character turn order 
    
    //Status effect 
    boolean wounded; 
    boolean poisoned; 

    //arraylist to hold Equipment 
    // Armour Armour;  
    // Weapon Weapon; 
    


    //Character Constructor Method 
    public Character (String name,int health, int strength,int defence,int intelligence,int initiative){
        this.name= name;
        this.health = health; 

        this.strength = strength; 
        this.defence = defence; 
        this.intelligence = intelligence; 
        this.initiative = initiative; 

        this.wounded = false; 
        this.poisoned = false; 

    }

    //Methods (get and set) character stats 
    public String getName(){
        return name; 
    }

    public int getHealth(){
        return health; 
    }

    public void setHealth (){
        this.health = Math.max(0,Math.min(health,maxHealthPoints));
    }

    public int getStrength(){
        return strength; 
    }

    public int getDefence(){
        return defence; 
    }
 
    public int getIntelligence() {
        return intelligence;
    }
    
    public int getInitiative() {
        return initiative;
    }

    public boolean isPoisoned() {
        return poisoned;
>>>>>>> parent of e9a1df1 (idk)
    }

    

<<<<<<< HEAD
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

    // Method to add an ally
    public void addAlly(Character ally) {
        this.allies.add(ally);
    }

    // Recursive method to display stats of the character and its allies
    public void displayStats() {
        System.out.println("Name: " + this.name + ", Health: " + this.health);
        // Recursively display allies' stats
        for (Character ally : allies) {
            ally.displayStats();
        }
    }

    // Recursive method for attacking until one character is no longer alive
    public void recursiveAttack(Character target) {
        if (!this.isAlive() || !target.isAlive()) {
            System.out.println("Attack sequence ended. " + this.getName() + " or " + target.getName() + " is not alive.");
            return; // End the recursion if either character is not alive
        }

        // If the target is still alive, it counter-attacks
        if (target.isAlive()) {
            target.attack(this);
        }

        // Recursive call for the next round of attack
        this.recursiveAttack(target);
    }
=======
>>>>>>> parent of e9a1df1 (idk)
}
