package rudaks._03_behavior_patterns._19_observer._spring.event;

import lombok.Getter;
import lombok.ToString;
import rudaks._03_behavior_patterns._19_observer._spring.message.Message;

@Getter
@ToString
public class MessageEvent {

    private Message message;

    public MessageEvent(Message message) {
        this.message = message;
    }
}
