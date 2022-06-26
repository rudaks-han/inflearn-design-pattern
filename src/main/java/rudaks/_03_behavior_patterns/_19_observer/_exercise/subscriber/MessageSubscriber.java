package rudaks._03_behavior_patterns._19_observer._exercise.subscriber;

import rudaks._03_behavior_patterns._19_observer._exercise.message.Message;

public interface MessageSubscriber {

    void handle(Message message);
}
