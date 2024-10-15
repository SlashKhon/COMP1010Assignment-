
import java.util.ArrayList;

public class Team {
    private ArrayList<Character> characters;

    public Team() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }

    public boolean hasLivingMembers() {
        for (Character c : characters) {
            if (c.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public Character getNextCharacter() {
        for (Character c : characters) {
            if (c.isAlive()) {
                return c;
            }
        }
        return null;
    }
}
