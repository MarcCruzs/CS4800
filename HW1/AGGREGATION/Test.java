package AGGREGATION;

public class Test {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("Nima");
        instructor1.setLastName("Davarpanah");
        instructor1.setOfficeNumber("3-2636");

        Instructor instructor2 = new Instructor();
        instructor2.setFirstName("George");
        instructor2.setLastName("Washington");
        instructor2.setOfficeNumber("8-5000");

        Textbook textbook1 = new Textbook();
        textbook1.setTitle("Clean Code");
        textbook1.setAuthor("Robert C. Martin");
        textbook1.setPublisher("Pearson");

        Textbook textbook2 = new Textbook();
        textbook2.setTitle("Dummy Title");
        textbook2.setAuthor("Really Old Guy");
        textbook2.setPublisher("Typerwriter");

        Instructor[] instructorArrayv1 = {instructor1};
        Textbook[] textbookArrayv1 = {textbook1};

        Instructor[] instructorArrayv2 = {instructor1, instructor2};
        Textbook[] textbookArrayv2 = {textbook1, textbook2};

        Course course1 = new Course("Essential Course v1", instructorArrayv1, textbookArrayv1);

        Course course2 = new Course("Essential Course v 2", instructorArrayv2, textbookArrayv2);

        course1.printInfo();
        System.out.println();
        course2.printInfo();


    }
}
