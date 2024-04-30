package Q1.tests;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import Q1.Document;
import Q1.CharacterProperties;

public class DocumentTest {

    @Test
    public void testAddCharacterAndGetCharacters() {
        Document document = new Document();
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        document.addCharacter('H', properties);
        assertEquals(1, document.getCharacters().size());
    }

    @Test
    public void testSaveAndLoad() throws IOException, ClassNotFoundException {
        Document document1 = new Document();
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        document1.addCharacter('H', properties);
        document1.save("test_document.ser");

        Document document2 = Document.load("test_document.ser");
        assertEquals(1, document2.getCharacters().size());
    }
}
