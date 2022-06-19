package rudaks._03_behavior_patterns._13_command._after;

import rudaks._03_behavior_patterns._13_command._before.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
