
import java.util.Scanner;

public class Game {
    private Team team1;
    private Team team2;
    private Combat combat;

    public Game() {
        this.team1 = new Team();
        this.team2 = new Team();
        this.combat = new Combat();
    }

    public void start() {
        setupTeams();
        while (team1.hasLivingMembers() && team2.hasLivingMembers()) {
            playTurn();
        }
        declareWinner();
    }

    private void setupTeams() {
        try (Scanner scanner = new Scanner(System.in)) { // Using try-with-resources to ensure the scanner is closed
            System.out.println("Create Team 1");
            team1.addCharacter(new Character("Warrior", 100, 15, 10));
            team1.addCharacter(new Character("Mage", 80, 20, 5));

            System.out.println("Create Team 2");
            team2.addCharacter(new Character("Orc", 120, 12, 15));
            team2.addCharacter(new Character("Rogue", 90, 18, 8));
        }
    }

    private void playTurn() {
        Character team1Char = team1.getNextCharacter();
        Character team2Char = team2.getNextCharacter();

        if (team1Char != null && team2Char != null) {
            System.out.println("Turn: " + team1Char + " vs " + team2Char);
            combat.fight(team1Char, team2Char);
        }
    }

    private void declareWinner() {
        if (team1.hasLivingMembers()) {
            System.out.println("Team 1 wins!");
        } else {
            System.out.println("Team 2 wins!");
        }
    }
}