import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
    
    private Character warrior;
    private Character orc;

    @Before
    public void setUp() {
        warrior = new Character("Warrior", 100, 15, 10);
        orc = new Character("Orc", 120, 12, 15);
    }

    // 1. Test Character Creation
    @Test
    public void testCharacterCreation() {
        assertEquals("Warrior", warrior.getName());
        assertEquals(100, warrior.getHealth());
        assertEquals(15, warrior.getStrength());
        assertEquals(10, warrior.getDefense());
    }

    // 2. Test isAlive() Method
    @Test
    public void testIsAlive() {
        assertTrue(warrior.isAlive());
        warrior.takeDamage(100);
        assertFalse(warrior.isAlive());
    }

    // 3. Test takeDamage() Method
    @Test
    public void testTakeDamage() {
        warrior.takeDamage(20);
        assertEquals(80, warrior.getHealth());
        warrior.takeDamage(90);
        assertEquals(0, warrior.getHealth()); // Health should not go below 0
    }

    // 4. Test attack() Method (with randomness)
    @Test
    public void testAttack() {
        int initialHealth = orc.getHealth();
        warrior.attack(orc);
        assertTrue(orc.getHealth() < initialHealth); // Orc should take damage
    }

    // 5. Test toString() Method
    @Test
    public void testToString() {
        assertEquals("Warrior (HP: 100)", warrior.toString());
        warrior.takeDamage(30);
        assertEquals("Warrior (HP: 70)", warrior.toString());
    }
}
