import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Character> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Character character) {
        members.add(character);
    }

    public List<Character> getMembers() {
        return members;
    }

    public void displayTeamStats() {
        System.out.println("Team: " + name);
        for (Character member : members) {
            member.displayStats();
        }
    }
}
