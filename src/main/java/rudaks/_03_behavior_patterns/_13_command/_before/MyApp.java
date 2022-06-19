package rudaks._03_behavior_patterns._13_command._before;

import rudaks._03_behavior_patterns._13_command._after.Command;
import rudaks._03_behavior_patterns._13_command._after.LightOffCommand;

public class MyApp {

    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new LightOffCommand(new Light()));
        myApp.press();
    }
}
