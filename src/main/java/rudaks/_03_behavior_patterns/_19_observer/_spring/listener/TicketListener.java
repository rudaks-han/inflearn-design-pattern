package rudaks._03_behavior_patterns._19_observer._spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import rudaks._03_behavior_patterns._19_observer._spring.event.MessageEvent;
import rudaks._03_behavior_patterns._19_observer._spring.event.TicketEvent;

@Component
public class TicketListener {

    @EventListener
    public void onApplicationEvent(TicketEvent event) {
        System.out.println("ticketEvent : " + event);
    }

}
