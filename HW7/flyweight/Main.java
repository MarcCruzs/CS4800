package HW7.flyweight;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        // Add a paragraph with different properties
        document.addParagraph("Hello World!", "Arial", "Red", 12);
        document.addParagraph("This is a sample paragraph.", "Calibri", "Blue", 14);
        document.addParagraph("Flyweight Pattern Example", "Verdana", "Black", 16);
        document.addParagraph("Lorem ipsum dolor sit amet.", "Arial", "Black", 12);

        // Save and load the document
        document.save("HelloWorldCS5800.txt");
        document.load("HelloWorldCS5800.txt");
    }
}