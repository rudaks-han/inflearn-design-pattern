package rudaks._03_behavior_patterns._19_observer._after;

import lombok.Getter;

@Getter
public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
