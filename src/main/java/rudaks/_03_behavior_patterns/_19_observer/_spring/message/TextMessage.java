package rudaks._03_behavior_patterns._19_observer._spring.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class TextMessage implements Message {

    private String text;
}
