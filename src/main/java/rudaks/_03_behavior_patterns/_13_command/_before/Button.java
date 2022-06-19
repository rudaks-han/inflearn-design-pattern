package rudaks._03_behavior_patterns._13_command._before;

public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
        // light.off();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
    }
}
