package rudaks._03_behavior_patterns._19_observer._spring;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import rudaks._03_behavior_patterns._19_observer._spring.event.MessageEvent;
import rudaks._03_behavior_patterns._19_observer._spring.message.FileMessage;
import rudaks._03_behavior_patterns._19_observer._spring.event.TicketEvent;
import rudaks._03_behavior_patterns._19_observer._spring.message.TextMessage;
import rudaks._03_behavior_patterns._19_observer._spring.ticket.Ticket;

@RequiredArgsConstructor
@Component
public class MyRunner implements ApplicationRunner {

    private final ApplicationEventPublisher publisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        publisher.publishEvent(new MessageEvent(new TextMessage("메시지")));
        publisher.publishEvent(new MessageEvent(new FileMessage("a.txt")));
        publisher.publishEvent(new TicketEvent(new Ticket("T1")));
    }
}
