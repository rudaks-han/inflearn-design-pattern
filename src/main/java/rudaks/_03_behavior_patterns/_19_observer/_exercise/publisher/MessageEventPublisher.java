package rudaks._03_behavior_patterns._19_observer._exercise.publisher;

import rudaks._03_behavior_patterns._19_observer._exercise.message.Message;
import rudaks._03_behavior_patterns._19_observer._exercise.subscriber.MessageSubscriber;

import java.util.ArrayList;
import java.util.List;

public class MessageEventPublisher implements MessagePublisher {

    private List<MessageSubscriber> messageSubscribers = new ArrayList<>();

    @Override
    public void register(MessageSubscriber messageSubscriber) {
        this.messageSubscribers.add(messageSubscriber);
    }

    @Override
    public void unregister(MessageSubscriber messageSubscriber) {
        this.messageSubscribers.remove(messageSubscriber);
    }

    @Override
    public void notifyToSubscribers(Message message) {
        this.messageSubscribers.forEach(messageSubscriber -> messageSubscriber.handle(message));
    }
}
