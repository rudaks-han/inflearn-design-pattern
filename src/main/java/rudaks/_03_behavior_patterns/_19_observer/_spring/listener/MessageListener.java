package rudaks._03_behavior_patterns._19_observer._spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import rudaks._03_behavior_patterns._19_observer._spring.event.MessageEvent;

@Component
public class MessageListener {

    @EventListener
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("messageEvent : " + event);
    }

}
