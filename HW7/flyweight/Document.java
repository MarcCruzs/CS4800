package HW7.flyweight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<String> paragraphs = new ArrayList<>();
    private final List<CharacterProperty> fonts = new ArrayList<>();
    private final List<CharacterProperty> colors = new ArrayList<>();
    private final List<CharacterProperty> sizes = new ArrayList<>();
    private final CharacterPropertyFactory propertyFactory = new CharacterPropertyFactory();

    public void addParagraph(String paragraph, String font, String color, int size) {
        paragraphs.add(paragraph);
        fonts.add(propertyFactory.getFont(font));
        colors.add(propertyFactory.getColor(color));
        sizes.add(propertyFactory.getSize(size));
    }

    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < paragraphs.size(); i++) {
                writer.println("Paragraph: " + (i + 1));
                writer.println("Font: " + fonts.get(i));
                writer.println("Color: " + colors.get(i));
                writer.println("Size: " + sizes.get(i));
                writer.println("Text: " + paragraphs.get(i));
                writer.println();
            }
            System.out.println("Document saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving document: " + e.getMessage());
        }
    }

    public void load(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Document loaded from " + filename);
        } catch (IOException e) {
            System.err.println("Error loading document: " + e.getMessage());
        }
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public List<CharacterProperty> getFonts() {
        return fonts;
    }

    public List<CharacterProperty> getColors() {
        return colors;
    }

    public List<CharacterProperty> getSizes() {
        return sizes;
    }
}


