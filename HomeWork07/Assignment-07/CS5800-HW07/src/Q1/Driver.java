package Q1;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
        Document document = new Document();
        document.addCharacter('H', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('e', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('l', new CharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('l', new CharacterProperties("Verdana", "Black", 16));
        document.addCharacter('o', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('W', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('o', new CharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('r', new CharacterProperties("Verdana", "Black", 16));
        document.addCharacter('l', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('d', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('C', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('S', new CharacterProperties("Calibri", "Blue", 14));
        document.addCharacter('5', new CharacterProperties("Verdana", "Black", 16));
        document.addCharacter('8', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('0', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('0', new CharacterProperties("Calibri", "Blue", 14));

        try {
            document.save("example_document.txt");
            System.out.println("Document saved successfully.");

            // Load the saved document
            Document loadedDocument = Document.load("example_document.txt");

            // Print loaded characters with their properties
            System.out.println("Loaded characters with their properties:");
            for (Character character : loadedDocument.getCharacters()) {
                System.out.println("Character: " + character.getCharacter() +
                        ", Font: " + character.getProperties().getFont() +
                        ", Color: " + character.getProperties().getColor() +
                        ", Size: " + character.getProperties().getSize());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
