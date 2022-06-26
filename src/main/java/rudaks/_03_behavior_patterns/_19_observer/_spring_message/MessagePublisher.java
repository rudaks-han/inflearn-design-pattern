package rudaks._03_behavior_patterns._19_observer._spring_message;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class MessagePublisher implements ApplicationRunner {

    private final ApplicationEventPublisher publisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        publisher.publishEvent(new MessageEvent(new Message("이벤트 전송합니다~")));
        log.info("event published.");
    }
}
