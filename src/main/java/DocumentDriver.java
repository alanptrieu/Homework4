public class DocumentDriver {
    public static void main(String[] args) {
        Document document = new Document();

        document.addCharacter('H', "Arial", 12, "Black");
        document.addCharacter('e', "Arial", 12, "Black");
        document.addCharacter('l', "Calibri", 14, "Red");
        document.addCharacter('l', "Calibri", 14, "Red");
        document.addCharacter('o', "Verdana", 16, "Blue");
        document.addCharacter('W', "Verdana", 16, "Blue");
        document.addCharacter('o', "Arial", 14, "Red");
        document.addCharacter('r', "Arial", 14, "Red");
        document.addCharacter('l', "Calibri", 16, "Blue");
        document.addCharacter('d', "Calibri", 16, "Blue");
        document.addCharacter('C', "Verdana", 12, "Black");
        document.addCharacter('S', "Verdana", 12, "Black");
        document.addCharacter('5', "Arial", 16, "Blue");
        document.addCharacter('8', "Arial", 16, "Blue");
        document.addCharacter('0', "Calibri", 14, "Black");
        document.addCharacter('0', "Calibri", 14, "Black");
        document.display();
    }
}
