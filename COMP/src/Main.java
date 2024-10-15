public class Main {
    public static void main(String[] args) {
        // Create teams
        Team heroTeam = new Team("Hero Team");
        Team villainTeam = new Team("Villain Team");

        // Create characters
        Character hero = new Character("Hero", 100, 20, 10); // Hero character
        Character ally1 = new Character("Ally1", 60, 15, 5); // Ally character
        Character ally2 = new Character("Ally2", 70, 18, 8); // Another ally
        Character villain = new Character("Villain", 80, 15, 5); // Villain character

        // Add characters to teams
        heroTeam.addMember(hero);
        heroTeam.addMember(ally1);
        heroTeam.addMember(ally2);
        villainTeam.addMember(villain);

        // Display initial stats
        System.out.println("Character Stats Before Battle:");
        heroTeam.displayTeamStats();
        villainTeam.displayTeamStats();

        // Start the battle using recursive attack
        System.out.println("\nBattle Begins!");
        hero.recursiveAttack(villain);

        // Check final statuses after battle
        System.out.println("\nFinal Statuses:");
        if (!hero.isAlive()) {
            System.out.println(hero.getName() + " has been defeated!");
        } else {
            System.out.println(hero.getName() + " is still standing!");
        }

        if (!villain.isAlive()) {
            System.out.println(villain.getName() + " has been defeated!");
        } else {
            System.out.println(villain.getName() + " is still standing!");
        }
    }
}
