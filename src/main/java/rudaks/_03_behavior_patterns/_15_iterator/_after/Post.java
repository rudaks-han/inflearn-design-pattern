package rudaks._03_behavior_patterns._15_iterator._after;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Post {

    private String content;

    private LocalDateTime createdDateTime;

    public Post(String content) {
        this.content = content;
        this.createdDateTime = LocalDateTime.now();
    }
}
