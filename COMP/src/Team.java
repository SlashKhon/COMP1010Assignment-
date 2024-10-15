import java.util.ArrayList;

public class Team {
    public ArrayList<Character> members;

    public Team() {
        members = new ArrayList<>();
    }

    public void addMember(Character character) {
        members.add(character);
    }

    public boolean hasAliveMembers() {
        for (Character member : members) {
            if (member.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public Character getNextAliveMember() {
        for (Character member : members) {
            if (member.isAlive()) {
                return member;
            }
        }
        return null;
    }

    public void displayTeam() {
        for (Character member : members) {
            System.out.println(member.getName() + " - Health: " + member.getHealth());
        }
    }
}
