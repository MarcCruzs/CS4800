package COMPOSITION;

public class File {
    private String fileName;

    /**
     * constructs the file class
     * @param fileName      The name of the file
     */
    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void printName(){
        System.out.println("- " + this.fileName);
    }
}
