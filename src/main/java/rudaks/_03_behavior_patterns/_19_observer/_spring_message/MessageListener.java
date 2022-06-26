package rudaks._03_behavior_patterns._19_observer._spring_message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @Async
    @EventListener
    public void handle(MessageEvent event) throws InterruptedException {
        Thread.sleep(3000);
        log.info("event received: " + event.getMessage().getText());
    }
}
