package rudaks._03_behavior_patterns._19_observer._exercise.publisher;

import rudaks._03_behavior_patterns._19_observer._exercise.message.Message;
import rudaks._03_behavior_patterns._19_observer._exercise.subscriber.MessageSubscriber;

public interface MessagePublisher {

    void register(MessageSubscriber messageSubscriber);

    void unregister(MessageSubscriber messageSubscriber);

    void notifyToSubscribers(Message message);
}
