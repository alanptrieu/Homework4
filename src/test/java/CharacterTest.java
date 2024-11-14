import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    private Character character;

    @BeforeEach
    void setUp() {
        character = new Character('T', "Arial", 12, "Black");
    }

    @Test
    void getLetter() {
        assertEquals('T', character.getLetter());
    }

    @Test
    void getFont() {
        assertEquals("Arial", character.getFont());
    }

    @Test
    void getSize() {
        assertEquals(12, character.getSize());
    }

    @Test
    void getColor() {
        assertEquals("Black", character.getColor());
    }

    @Test
    void testToString() {
        String expected = "Letter: T, Font: Arial, Size: 12, Color: Black";
        assertEquals(expected, character.toString());
    }
}