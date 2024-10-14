package AGGREGATION;

public class Course {
    private String courseName;
    private Instructor[] instructors;

    private Textbook[] textbooks;

    /**
     * Constructs member of Course and aggregation of instructor and textbook classes.
     * @param courseName            The name of the course
     * @param instructors           The instructors' information
     * @param textbooks             The textbooks' information
     */
    public Course(String courseName, Instructor[] instructors, Textbook[] textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Textbook[] getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }

    public void printInfo(){
        System.out.println("Course Name: " + courseName);
        for (int i = 0; i < instructors.length; i++) {
            System.out.println("Instructor " + (i + 1) + ": " + instructors[i].getFirstName() + " "
                    + instructors[i].getLastName() + ", Office Number: " + instructors[i].getOfficeNumber());
        }
        for (int i = 0; i < textbooks.length; i++) {
            System.out.println("Textbook " + (i + 1) + ": " + textbooks[i].getTitle() + ", Author: "
                    + textbooks[i].getAuthor() + ", Publisher: " + textbooks[i].getPublisher());
        }
    }
}
