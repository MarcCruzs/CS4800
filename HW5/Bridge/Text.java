package HW5.Bridge;

public class Text implements Media {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
