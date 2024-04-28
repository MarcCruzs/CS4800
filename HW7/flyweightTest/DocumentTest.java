package HW7.flyweightTest;

import HW7.flyweight.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {
    private Document document;
    private final String testFilename = "test_document.txt";

    @BeforeEach
    void setUp() {
        document = new Document();
    }

    @Test
    void addParagraph() {
        document.addParagraph("This is a test paragraph.", "Arial", "Black", 12);
        assertEquals(1, document.getParagraphs().size());
        assertEquals(1, document.getFonts().size());
        assertEquals(1, document.getColors().size());
        assertEquals(1, document.getSizes().size());
    }

    @Test
    void save(){
        // Add paragraphs to the document
        document.addParagraph("First paragraph", "Arial", "Black", 12);
        document.addParagraph("Second paragraph", "Times New Roman", "Blue", 14);

        document.save(testFilename);

        File file = new File(testFilename);
        assertTrue(file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(testFilename))) {
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        String expectedContent = "Paragraph: 1\n" +
                "Font: Arial\n" +
                "Color: Black\n" +
                "Size: 12\n" +
                "Text: First paragraph\n" +
                "\n" +
                "Paragraph: 2\n" +
                "Font: Times New Roman\n" +
                "Color: Blue\n" +
                "Size: 14\n" +
                "Text: Second paragraph\n" +
                "\n";
        assertEquals(expectedContent, content.toString());
    } catch (IOException e) {
        fail("Error reading the saved document: " + e.getMessage());
    }

        assertTrue(file.delete());
    }
}