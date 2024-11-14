import java.util.*;

public class Document {
    private List<Character> characters = new ArrayList<>();
    private CharacterFactory characterFactory = new CharacterFactory();

    public void addCharacter(char letter, String font, int size, String color){
        CharacterProperties properties = characterFactory.getCharacterProperties(letter, font, size, color);
        characters.add(new Character(letter, font, size, color));
    }

    public void display(){
        for(Character character : characters){
            System.out.println(character);
        }
    }
}
