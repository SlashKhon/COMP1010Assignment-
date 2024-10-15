public class Game {
    public Team team1;
    public Team team2;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void start() {
        System.out.println("Game Started!");

        while (team1.hasAliveMembers() && team2.hasAliveMembers()) {
            Character attacker = team1.getNextAliveMember();
            Character target = team2.getNextAliveMember();

            if (attacker != null && target != null) {
                attacker.attack(target);  // Attacker attacks the target from the opposite team
            }

            // Switch teams' turns
            Team temp = team1;
            team1 = team2;
            team2 = temp;
        }

        // Determine the winner
        if (team1.hasAliveMembers()) {
            System.out.println("Team 1 wins!");
        } else if (team2.hasAliveMembers()) {
            System.out.println("Team 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
