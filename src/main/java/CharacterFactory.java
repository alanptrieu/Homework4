import java.util.*;

public class CharacterFactory {
    private Map<String, CharacterProperties> propertiesMap = new HashMap<>();

    public CharacterProperties getCharacterProperties(char letter, String font, int size, String color) {
        String key = letter + font + size + color;
        if (!propertiesMap.containsKey(key)) {
            propertiesMap.put(key, new Character(letter, font, size, color));
        }
        return propertiesMap.get(key);
    }
}
