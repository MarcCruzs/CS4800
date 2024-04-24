package HW7.flyweight;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        CharacterPropertyFactory propertyFactory = new CharacterPropertyFactory();

        // Add a paragraph with different properties
        document.addParagraph("Hello World!", propertyFactory.getFont("Arial"), propertyFactory.getColor("Red"), propertyFactory.getSize(12));
        document.addParagraph("This is a sample paragraph.", propertyFactory.getFont("Calibri"), propertyFactory.getColor("Blue"), propertyFactory.getSize(14));
        document.addParagraph("Flyweight Pattern Example", propertyFactory.getFont("Verdana"), propertyFactory.getColor("Black"), propertyFactory.getSize(16));
        document.addParagraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. " +
                "Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. " +
                "Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. " +
                "Duis semper. Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue. Ut in " +
                "risus volutpat libero pharetra tempor. Cras vestibulum bibendum aug",
                propertyFactory.getFont("Arial"), propertyFactory.getColor("Red"), propertyFactory.getSize(12));

        // Save and load the document
        document.save("HelloWorldCS5800.txt");
        document.load("HelloWorldCS5800.txt");
    }
}