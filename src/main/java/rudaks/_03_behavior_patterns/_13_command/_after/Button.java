package rudaks._03_behavior_patterns._13_command._after;

import rudaks._03_behavior_patterns._13_command._before.Light;

public class Button {

    public Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(new LightOffCommand(new Light()));
        button.press();
    }
}
