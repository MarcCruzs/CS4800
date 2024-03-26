package HW5.Bridge;

public class Image implements Media{
    private String text;

    public Image(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
