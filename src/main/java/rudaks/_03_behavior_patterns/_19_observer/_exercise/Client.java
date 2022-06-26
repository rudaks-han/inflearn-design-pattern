package rudaks._03_behavior_patterns._19_observer._exercise;

import rudaks._03_behavior_patterns._19_observer._exercise.message.Message;
import rudaks._03_behavior_patterns._19_observer._exercise.message.TextMessage;
import rudaks._03_behavior_patterns._19_observer._exercise.publisher.MessageEventPublisher;
import rudaks._03_behavior_patterns._19_observer._exercise.subscriber.OfficeMessageSubscriber;
import rudaks._03_behavior_patterns._19_observer._exercise.subscriber.SchoolMessageSubscriber;

public class Client {

    public static void main(String[] args) {
        MessageEventPublisher messageEventPublisher = new MessageEventPublisher();
        OfficeMessageSubscriber officeMessageSubscriber = new OfficeMessageSubscriber(messageEventPublisher);
        SchoolMessageSubscriber schoolMessageSubscriber = new SchoolMessageSubscriber(messageEventPublisher);

        Message message = new TextMessage("안녕하세요");
        messageEventPublisher.notifyToSubscribers(message);

    }
}
