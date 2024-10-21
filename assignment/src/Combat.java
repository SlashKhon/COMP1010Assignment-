
public class Combat {
    public void fight(Character character1, Character character2) {
        character1.attack(character2);
        if (character2.isAlive()) {
            character2.attack(character1);
        }
    }
}
