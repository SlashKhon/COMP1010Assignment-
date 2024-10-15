public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero", 100, 20, 10); // Name, Health, Strength, Defense
        Character villain = new Character("Villain", 80, 15, 5);
        
        // Example of an attack
        hero.attack(villain);
        
        // Check if villain is alive
        if (!villain.isAlive()) {
            System.out.println(villain.getName() + " has been defeated!");
        }
    }
}
