package HW5.Bridge;

public class Video implements Media{
    private String text;

    public Video(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
