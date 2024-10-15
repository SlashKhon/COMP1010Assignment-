import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating teams
        Team heroTeam = new Team("Hero Team");
        Team villainTeam = new Team("Villain Team");
        
        // Adding characters to Hero Team
        Character hero = new Character("Hero", 100, 20, 10);
        Character ally1 = new Character("Ally1", 50, 10, 3);
        Character ally2 = new Character("Ally2", 60, 12, 4);
        
        heroTeam.addMember(hero);
        heroTeam.addMember(ally1);
        heroTeam.addMember(ally2);
        
        // Adding characters to Villain Team
        Character villain = new Character("Villain", 80, 15, 5);
        villainTeam.addMember(villain);
        
        // Display team stats
        System.out.println("Character Stats Before Battle:");
        heroTeam.displayTeamStats();
        villainTeam.displayTeamStats();
        
        // Start the battle
        System.out.println("\nBattle Begins!");
        hero.recursiveAttack(villain);
        
        // Check final statuses
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

        scanner.close();
    }
}
