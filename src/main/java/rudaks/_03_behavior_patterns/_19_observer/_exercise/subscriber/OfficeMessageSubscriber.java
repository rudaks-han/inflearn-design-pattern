package rudaks._03_behavior_patterns._19_observer._exercise.subscriber;

import rudaks._03_behavior_patterns._19_observer._exercise.message.Message;
import rudaks._03_behavior_patterns._19_observer._exercise.publisher.MessagePublisher;

public class OfficeMessageSubscriber implements MessageSubscriber {

    public OfficeMessageSubscriber(MessagePublisher messagePublisher) {
        messagePublisher.register(this);
    }

    @Override
    public void handle(Message message) {
        System.out.println("office received: " + message);
    }
}
