public class Character implements CharacterProperties {
    private char letter;
    private String font;
    private int size;
    private String color;

    public Character(char letter, String font, int size, String color) {
        this.letter = letter;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String getFont() {
        return font;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Letter: " + letter + ", Font: " + font + ", Size: " + size + ", Color: " + color;
    }
}
