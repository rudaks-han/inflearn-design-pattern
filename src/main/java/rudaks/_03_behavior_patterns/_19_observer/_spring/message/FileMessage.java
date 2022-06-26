package rudaks._03_behavior_patterns._19_observer._spring.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class FileMessage implements Message {

    private String filename;
}
