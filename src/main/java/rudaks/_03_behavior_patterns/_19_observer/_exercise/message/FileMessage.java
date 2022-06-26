package rudaks._03_behavior_patterns._19_observer._exercise.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FileMessage implements Message {

    private String filename;
}
